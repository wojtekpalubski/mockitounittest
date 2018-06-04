package com.wpe.unittest.controller;

import com.wpe.unittest.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemBusinessService {
    public Item retrieveItem() {
        return new Item(1, "Ball", 10, 100);
    }
}
