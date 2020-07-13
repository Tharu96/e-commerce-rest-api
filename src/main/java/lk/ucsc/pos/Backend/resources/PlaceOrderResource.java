package lk.ucsc.pos.Backend.resources;

import java.io.Serializable;
import java.util.List;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
public class PlaceOrderResource implements Serializable {

    private OrdersResource  ordersResource;
    private List<OrderDetailResource> allOrderDetailResourceList;

    public PlaceOrderResource() {
    }

    public PlaceOrderResource(OrdersResource ordersResource, List<OrderDetailResource> allOrderDetailResourceList) {
        this.ordersResource = ordersResource;
        this.allOrderDetailResourceList = allOrderDetailResourceList;
    }

    public OrdersResource getOrdersResource() {
        return ordersResource;
    }

    public void setOrdersResource(OrdersResource ordersResource) {
        this.ordersResource = ordersResource;
    }

    public List<OrderDetailResource> getAllOrderDetailResourceList() {
        return allOrderDetailResourceList;
    }

    public void setAllOrderDetailResourceList(List<OrderDetailResource> allOrderDetailResourceList) {
        this.allOrderDetailResourceList = allOrderDetailResourceList;
    }

    @Override
    public String toString() {
        return "PlaceOrderResource{" +
                "ordersResource=" + ordersResource +
                ", allOrderDetailResourceList=" + allOrderDetailResourceList +
                '}';
    }
}
