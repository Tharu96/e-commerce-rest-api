package lk.ucsc.pos.Backend.controller;

import lk.ucsc.pos.Backend.resources.PlaceOrderResource;
import lk.ucsc.pos.Backend.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
@RestController
@RequestMapping(name = "/orders")
public class OrderController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping(value = "save")
    public boolean placeOrder(@RequestBody PlaceOrderResource placeOrderResource){
        System.out.println("customer check controller" + placeOrderResource.getOrdersResource().getCusID());
        return ordersService.save(placeOrderResource);
    }


}
