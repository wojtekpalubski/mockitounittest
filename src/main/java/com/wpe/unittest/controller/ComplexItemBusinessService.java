package com.wpe.unittest.controller;

import com.wpe.unittest.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplexItemBusinessService {

    @Autowired
    ItemBusinessService itemBusinessService;

    public Item retrieveFirstItem(){
        return itemBusinessService.retrieveAllItems()
                .stream()
                .findFirst()
                .orElse(new Item(-1,"puste",-1,-1));
    }
}
