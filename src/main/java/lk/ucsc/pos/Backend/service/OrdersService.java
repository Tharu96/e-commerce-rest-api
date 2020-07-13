package lk.ucsc.pos.Backend.service;

import lk.ucsc.pos.Backend.model.*;
import lk.ucsc.pos.Backend.repository.CustomerRepository;
import lk.ucsc.pos.Backend.repository.OrderDetailRepository;
import lk.ucsc.pos.Backend.repository.OrdersRepository;
import lk.ucsc.pos.Backend.resources.OrderDetailResource;
import lk.ucsc.pos.Backend.resources.PlaceOrderResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;



    @Transactional
    public boolean save(PlaceOrderResource placeOrderResource) {
        OrderDetailResource orderDetailResource = new OrderDetailResource();
        Customer customer= customerRepository.findByCid(placeOrderResource.getOrdersResource().getCusID());

        Orders orders = new Orders(placeOrderResource.getOrdersResource().getOid(), placeOrderResource.getOrdersResource().getDate(), customer);

        if (ordersRepository.save(orders) != null){
            for (OrderDetailResource orderDetailResource1: placeOrderResource.getAllOrderDetailResourceList()) {
                Item item = new Item(orderDetailResource1.getItemResource().getItemcode(), orderDetailResource1.getItemResource().getName(), orderDetailResource1.getItemResource().getPrice(), orderDetailResource1.getItemResource().getQty());
               OrderDetail orderDetail=new OrderDetail(orderDetailResource1.getSold_order_qty(), orders, item, new OrderDetail_PK(orders.getOid(), item.getItemcode()) );
                orderDetailRepository.save(orderDetail);
            }
            return true;
        }
        return false;
    }
}
