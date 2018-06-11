package com.wpe.unittest.business;

import com.wpe.unittest.data.ItemRepository;
import com.wpe.unittest.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@DataJpaTest
@RunWith(SpringRunner.class)
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository repository;

    @Test
    public void findAll_test() {
        List<Item> items = repository.findAll();
        assertEquals(3,items.size());
    }
}
