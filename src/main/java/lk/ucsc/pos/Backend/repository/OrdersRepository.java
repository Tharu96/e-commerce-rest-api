package lk.ucsc.pos.Backend.repository;

import lk.ucsc.pos.Backend.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
public interface OrdersRepository extends JpaRepository<Orders,Integer> {

}
