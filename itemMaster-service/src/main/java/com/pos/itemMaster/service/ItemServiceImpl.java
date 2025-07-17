package com.pos.itemMaster.service;

import com.pos.itemMaster.model.Item;
import com.pos.itemMaster.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item getItemByCode(String itemCode) {
        return itemRepository.findById(itemCode).orElse(null);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item updateItem(String itemCode, Item item) {
        if (itemRepository.existsById(itemCode)) {
            item.setItemCode(itemCode);
            return itemRepository.save(item);
        }
        return null;
    }

    @Override
    public void deleteItem(String itemCode) {
        itemRepository.deleteById(itemCode);
    }
}
