package lk.ucsc.pos.Backend.service;

import lk.ucsc.pos.Backend.model.Customer;
import lk.ucsc.pos.Backend.repository.CustomerRepository;
import lk.ucsc.pos.Backend.resources.CustomerResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public boolean save(CustomerResource customerResource){
        Customer newCustomer=new Customer();
        newCustomer.setName(customerResource.getName());
        newCustomer.setAddress(customerResource.getAddress());
        newCustomer.setContacts(customerResource.getContacts());

        Customer saveCustomer=customerRepository.save(newCustomer);
        if(saveCustomer!=null){
            return true;
        }
        return false;
    }

    public CustomerResource findByCid (int id){
        Customer customer=customerRepository.findByCid(id);
        if(customer !=null){
            return new CustomerResource(customer.getCid(),customer.getName(),customer.getAddress(),customer.getContacts());
        }
        return null;
    }

    public boolean update (CustomerResource customerResource){
        Customer existingCustomer=customerRepository.findByCid(customerResource.getCid());
        if(existingCustomer!=null){
            Customer updateCustomer=customerRepository.save(new Customer(customerResource.getCid(),customerResource.getName(),customerResource.getAddress(),customerResource.getContacts()));
            if(updateCustomer!=null){
                return true;
            }
        }
        return false;
    }

    public boolean delete (int cid){
        Customer existingCustomer=customerRepository.findByCid(cid);
        if(existingCustomer!=null){
            customerRepository.deleteByCid(cid);
            return true;
        }
        return false;
    }

    public List<CustomerResource> getAll (){

        List<CustomerResource> allCustomerResources=new ArrayList<>();
        if(customerRepository.findAll()!=null){
            for(Customer customer: customerRepository.findAll()){
                CustomerResource customerResource=new CustomerResource(customer.getCid(),customer.getName(),customer.getAddress(),customer.getContacts());
                allCustomerResources.add(customerResource);
            };
            return allCustomerResources;
        }
        return null;

    }

}
