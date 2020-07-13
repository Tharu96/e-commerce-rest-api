package lk.ucsc.pos.Backend.service;

import lk.ucsc.pos.Backend.model.Item;
import lk.ucsc.pos.Backend.repository.ItemRepository;
import lk.ucsc.pos.Backend.resources.ItemResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sashini Tharuka on 7/13/2020.
 */
@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public boolean saveItem(ItemResource itemResource){
        Item newItem=new Item();
        newItem.setName(itemResource.getName());
        newItem.setPrice(itemResource.getPrice());
        newItem.setQty(itemResource.getQty());

        Item saveItem=itemRepository.save(newItem);
        if(saveItem !=null){
            return true;
        }
        return false;
    }

    public ItemResource findByItemcode (int itemcode){
        Item item=itemRepository.findByItemcode(itemcode);
        if(item !=null){
            return new ItemResource(item.getItemcode(),item.getName(),item.getPrice(),item.getQty());
        }
        return null;
    }

    public boolean update (ItemResource itemResource){
        Item existingItem=itemRepository.findByItemcode(itemResource.getItemcode());
        if(existingItem!=null){
            Item updateItem=itemRepository.save(new Item(itemResource.getItemcode(),itemResource.getName(),itemResource.getPrice(),itemResource.getQty()));
            if(updateItem!=null){
                return true;
            }
        }
        return false;
    }

    public boolean delete (int itemCode){
        Item existingItem=itemRepository.findByItemcode(itemCode);
        if(existingItem!=null){
            itemRepository.deleteByItemcode(itemCode);
            return true;
        }
        return false;
    }

    public List<ItemResource> getAll (){

        List<ItemResource> allItemResource=new ArrayList<>();
        if(itemRepository.findAll()!=null){
            for(Item item: itemRepository.findAll()){
                ItemResource itemResource=new ItemResource(item.getItemcode(),item.getName(),item.getPrice(),item.getQty());
                allItemResource.add(itemResource);
            };
            return allItemResource;
        }
        return null;

    }
}
