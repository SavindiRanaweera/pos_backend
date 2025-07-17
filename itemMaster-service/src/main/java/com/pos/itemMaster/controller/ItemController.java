package com.pos.itemMaster.controller;

import com.pos.itemMaster.model.Item;
import com.pos.itemMaster.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    @GetMapping("/{itemCode}")
    public Item getItem(@PathVariable String itemCode) {
        return itemService.getItemByCode(itemCode);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @PutMapping("/{itemCode}")
    public Item updateItem(@PathVariable String itemCode, @RequestBody Item item) {
        return itemService.updateItem(itemCode, item);
    }

    @DeleteMapping("/{itemCode}")
    public void deleteItem(@PathVariable String itemCode) {
        itemService.deleteItem(itemCode);
    }
}

