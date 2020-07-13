package lk.ucsc.pos.Backend.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
@Entity
@Table(name = "orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int oid;
    private String date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cid")
    private Customer customer;


    public Orders() {
    }


    public Orders(String date, Customer customer) {
        this.date = date;
        this.customer = customer;
    }

    public Orders(int oid, String date, Customer customer) {
        this.oid = oid;
        this.date = date;
        this.customer = customer;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
