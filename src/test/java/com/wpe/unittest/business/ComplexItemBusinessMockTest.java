package com.wpe.unittest.business;

import com.wpe.unittest.controller.ComplexItemBusinessService;
import com.wpe.unittest.data.ItemRepository;
import com.wpe.unittest.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComplexItemBusinessMockTest {

    @Autowired
    private ComplexItemBusinessService complexItemBusinessService;

    @MockBean
    private ItemRepository repository;

    @Test
    public void pierwszy(){
        Mockito.when(repository.findAll()).thenReturn(Arrays.asList(
                new Item(12, "Ball", 10, 100),
                new Item(13, "Ball2", 102, 1002),
                new Item(14, "Ball3", 103, 1003)));

        assertEquals(complexItemBusinessService.retrieveFirstItem().getId(), 12);
    }
}
