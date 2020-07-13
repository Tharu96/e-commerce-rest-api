package lk.ucsc.pos.Backend.controller;

import lk.ucsc.pos.Backend.resources.CustomerResource;
import lk.ucsc.pos.Backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value="/save")
    public boolean saveCustomer(@RequestBody CustomerResource customerResource){
        return customerService.save(customerResource);

    }

    @GetMapping(value="/all")
    public List<CustomerResource> getAll(){
        return customerService.getAll();
    }

    @GetMapping(value = "/search/{cid}")
    public CustomerResource findByCid(@PathVariable int cid){
        return customerService.findByCid(cid);
    }

    @PutMapping(value = "/update")
    public boolean updateCustomer(@RequestBody CustomerResource customerResource){
        return customerService.update(customerResource);
    }

    @DeleteMapping(value = "/delete/{cid}")
    public boolean deleteCustomer(@PathVariable int cid){
        return customerService.delete(cid);
    }


}
