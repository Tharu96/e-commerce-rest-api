package lk.ucsc.pos.Backend.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
@Entity
@Table(name = "order-detail")
public class OrderDetail implements Serializable {

    private int sold_order_qty;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="oid", referencedColumnName = "oid", insertable = false, updatable = false)
    private Orders orders;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="iid", referencedColumnName = "iid", insertable = false,updatable = false)
    private Item item;
    @EmbeddedId
    private OrderDetail_PK orderDetail_pk;

    public OrderDetail() {
    }

    public OrderDetail(int sold_order_qty, Orders orders, Item item, OrderDetail_PK orderDetail_pk) {
        this.sold_order_qty = sold_order_qty;
        this.orders = orders;
        this.item = item;
        this.orderDetail_pk = orderDetail_pk;
    }

    public int getSold_order_qty() {
        return sold_order_qty;
    }

    public void setSold_order_qty(int sold_order_qty) {
        this.sold_order_qty = sold_order_qty;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public OrderDetail_PK getOrderDetail_pk() {
        return orderDetail_pk;
    }

    public void setOrderDetail_pk(OrderDetail_PK orderDetail_pk) {
        this.orderDetail_pk = orderDetail_pk;
    }
}
