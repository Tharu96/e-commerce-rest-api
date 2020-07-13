package lk.ucsc.pos.Backend.controller;

import lk.ucsc.pos.Backend.resources.ItemResource;
import lk.ucsc.pos.Backend.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
@RestController
@RequestMapping(name = "/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping(value="/save")
    public boolean saveItem(@RequestBody ItemResource itemResource){
        return itemService.saveItem(itemResource);

    }

    @GetMapping(value="/all")
    public List<ItemResource> getAll(){
        return itemService.getAll();
    }

    @GetMapping(value = "/search/{itemcode}")
    public ItemResource findByItemcode(@PathVariable int itemcode){
        return itemService.findByItemcode(itemcode);
    }

    @PutMapping(value = "/update")
    public boolean updateItem(@RequestBody ItemResource itemResource){
        return itemService.update(itemResource);
    }

    @DeleteMapping(value = "/delete/{itemcode}")
    public boolean deleteCustomer(@PathVariable int itemcode){
        return itemService.delete(itemcode);
    }

}
