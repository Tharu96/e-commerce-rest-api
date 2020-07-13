package lk.ucsc.pos.Backend.resources;

import java.io.Serializable;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
public class CustomerResource implements Serializable{
    private int cid;
    private String name;
    private String address;
    private String contacts;

    public CustomerResource() {
    }

    public CustomerResource(String name, String address, String contacts) {
        this.name = name;
        this.address = address;
        this.contacts = contacts;
    }

    public CustomerResource(int cid,String name, String address, String contacts) {
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
        return "CustomerResource{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contacts='" + contacts + '\'' +
                '}';
    }
}
