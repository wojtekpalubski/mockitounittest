package com.wpe.unittest;

import com.wpe.unittest.controller.ItemBusinessService;
import com.wpe.unittest.controller.ItemController;
import com.wpe.unittest.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockmvc;

    @MockBean
    private ItemBusinessService businessService;

    @Test
    public void helloItem_stringtest() {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/dummy-item")
                .accept(MediaType.APPLICATION_JSON);
        try {
            MvcResult result = mockmvc.perform(request)
                    .andExpect(status().isOk())
                    .andExpect(content().string("{\"id\":1,\"quantity\":100,\"name\":\"Ball\",\"price\":10,\"value\":0}"))
                    .andReturn();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void helloItem_jsontest() {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/dummy-item")
                .accept(MediaType.APPLICATION_JSON);
        try {
            MvcResult result = mockmvc.perform(request)
                    .andExpect(status().isOk())
                    .andExpect(content().json("{\"quantity\"  :100,\"id\":1,\"name\":\"Ball\",\"price\":10}"))
                    .andReturn();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void helloItem_json2test() {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/dummy-item")
                .accept(MediaType.APPLICATION_JSON);
        try {
            MvcResult result = mockmvc.perform(request)
                    .andExpect(status().isOk())
                    .andExpect(content().json("{\"quantity\"  :100,\"id\":1,\"name\":\"Ball\"}"))
                    .andReturn();

            //JSONAssert.assertEquals(expected, actual, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void businessItem_test() {

        when(businessService.retrieveHardcodedItem()).thenReturn(new Item(1, "Ball", 10, 100));

        RequestBuilder request = MockMvcRequestBuilders
                .get("/business-item")
                .accept(MediaType.APPLICATION_JSON);
        try {
            MvcResult result = mockmvc.perform(request)
                    .andExpect(status().isOk())
                    .andExpect(content().json("{\"quantity\"  :100,\"id\":1,\"name\":\"Ball\"}"))
                    .andReturn();

            //JSONAssert.assertEquals(expected, actual, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void businessAllItems_test() {

        when(businessService.retrieveAllItems()).thenReturn(Arrays.asList(
                new Item(1, "Ball", 10, 100),
                new Item(2, "Ball2", 102, 1002),
                new Item(3, "Ball3", 103, 1003)));

        RequestBuilder request = MockMvcRequestBuilders
                .get("/all-item")
                .accept(MediaType.APPLICATION_JSON);
        try {
            MvcResult result = mockmvc.perform(request)
                    .andExpect(status().isOk())
                    .andExpect(content().json("[{\"quantity\"  :100,\"id\":1,\"name\":\"Ball\"},{quantity  :1002,id:2,name:Ball2},{}]"))
                    .andReturn();

            //JSONAssert.assertEquals(expected, actual, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
