package com.wpe.unittest.controller;

import com.wpe.unittest.data.ItemRepository;
import com.wpe.unittest.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemBusinessService {
    @Autowired
    ItemRepository repository;

    public Item retrieveHardcodedItem() {
        return new Item(1, "Ball", 10, 100);
    }

    public List<Item> retrieveAllItems(){
        List<Item> items= repository.findAll();
        items.forEach(i->i.setValue(i.getPrice()*i.getQuantity()));
        return  items;
    }
}
