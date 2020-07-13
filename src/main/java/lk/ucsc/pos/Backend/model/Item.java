package lk.ucsc.pos.Backend.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
@Entity
@Table(name = "item")
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemcode;
    private String name;
    private double price;
    private int qty;

    public Item() {
    }

    public Item(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Item(int itemcode,String name, double price, int qty) {
        this.itemcode=itemcode;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getItemcode() {
        return itemcode;
    }

    public void setItemcode(int itemcode) {
        this.itemcode = itemcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemcode=" + itemcode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}

