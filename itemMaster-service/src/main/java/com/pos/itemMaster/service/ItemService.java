package com.pos.itemMaster.service;

import com.pos.itemMaster.model.Item;

import java.util.List;

public interface ItemService {
    Item saveItem( Item item);
    Item getItemByCode(String itemCode);
    List<Item> getAllItems();
    Item updateItem(String itemCode, Item item);
    void deleteItem(String itemCode);
}
