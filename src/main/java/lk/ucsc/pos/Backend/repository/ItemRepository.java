package lk.ucsc.pos.Backend.repository;

import lk.ucsc.pos.Backend.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
public interface ItemRepository extends JpaRepository<Item,Integer> {

    Item findByItemcode(int itemcode);

    void deleteByItemcode(int itemcode);
}
