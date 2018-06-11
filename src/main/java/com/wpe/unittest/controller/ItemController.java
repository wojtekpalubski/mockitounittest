package com.wpe.unittest.controller;

import com.wpe.unittest.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemBusinessService businessService;

    @GetMapping("/dummy-item")
    public Item helloItem() {
        return new Item(1, "Ball", 10, 100);
    }

    @GetMapping("/business-item")
    public Item businessItem() {
        return businessService.retrieveHardcodedItem();
    }
    @GetMapping("/all-item")
    public List<Item> businessAllItem() {
        List<Item> items= businessService.retrieveAllItems();
        items.forEach(i->i.setValue(i.getPrice()*i.getQuantity()));
        return items;
    }
}
