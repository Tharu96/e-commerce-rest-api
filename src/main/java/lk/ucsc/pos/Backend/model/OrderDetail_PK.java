package lk.ucsc.pos.Backend.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
@Embeddable
public class OrderDetail_PK  implements Serializable{

    private int oid;
    private int iid;

    public OrderDetail_PK() {
    }

    public OrderDetail_PK(int oid, int iid) {
        this.oid = oid;
        this.iid = iid;
    }
}
