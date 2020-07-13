package lk.ucsc.pos.Backend.repository;

import lk.ucsc.pos.Backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Customer findByCid(int cid);

    void deleteByCid(int cid);
}
