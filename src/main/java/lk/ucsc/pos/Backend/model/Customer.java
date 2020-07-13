package lk.ucsc.pos.Backend.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String name;
    private String address;
    private String contacts;

    public Customer() {
    }

    public Customer(String name, String address, String contacts) {
        this.name = name;
        this.address = address;
        this.contacts = contacts;
    }

    public Customer(int cid,String name, String address, String contacts) {
        this.cid=cid;
        this.name = name;
        this.address = address;
        this.contacts = contacts;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contacts='" + contacts + '\'' +
                '}';
    }
}
