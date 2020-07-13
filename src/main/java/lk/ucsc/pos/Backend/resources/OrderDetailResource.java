package lk.ucsc.pos.Backend.resources;

import java.io.Serializable;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
public class OrderDetailResource implements Serializable {

    private int sold_order_qty;
    private ItemResource itemResource;

    public OrderDetailResource() {
    }

    public OrderDetailResource(int sold_order_qty, ItemResource itemResource) {
        this.sold_order_qty = sold_order_qty;
        this.itemResource = itemResource;
    }

    public int getSold_order_qty() {
        return sold_order_qty;
    }

    public void setSold_order_qty(int sold_order_qty) {
        this.sold_order_qty = sold_order_qty;
    }

    public ItemResource getItemResource() {
        return itemResource;
    }

    public void setItemResource(ItemResource itemResource) {
        this.itemResource = itemResource;
    }
}
