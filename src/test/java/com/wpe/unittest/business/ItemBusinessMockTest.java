package com.wpe.unittest.business;

import com.wpe.unittest.controller.ItemBusinessService;
import com.wpe.unittest.data.ItemRepository;
import com.wpe.unittest.model.Item;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ItemBusinessMockTest {

    @InjectMocks
    private ItemBusinessService b;

    @Mock
    private ItemRepository repository;

    @Test
    public void calculateSumUsingService_test() {

        when(repository.findAll()).thenReturn(Arrays.asList(
                new Item(1, "Ball", 10, 100),
                new Item(2, "Ball2", 102, 1002),
                new Item(3, "Ball3", 103, 1003)));


        List<Item> items= b.retrieveAllItems();
        assertEquals(1000,items.get(0).getValue());
        assertEquals(102204,items.get(1).getValue());
    }

}

