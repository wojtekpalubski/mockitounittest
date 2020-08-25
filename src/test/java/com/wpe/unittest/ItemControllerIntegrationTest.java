//package com.wpe.unittest;
//
//import com.wpe.unittest.data.ItemRepository;
//import com.wpe.unittest.model.Item;
//import org.json.JSONException;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.skyscreamer.jsonassert.JSONAssert;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.mockito.Mockito.when;
//
//@SpringBootTest
//        (webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@RunWith(SpringRunner.class)
//@TestPropertySource(locations = {"classpath:application.properties"})
//public class ItemControllerIntegrationTest {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    // opcjonalne, żeby nie korzystał z bazy
//    @MockBean
//    private ItemRepository repository;
//
//    @Before
//    public void setUp() throws Exception {
//        when(repository.findAll()).thenReturn(Arrays.asList(
//                new Item(1001, "Ball", 10, 20),
//                new Item(1002, "Ball2", 102, 1002),
//                new Item(1003, "Ball3", 103, 1003)));
//    }
//
//    @Test
//    public void contextLoads() throws JSONException {
//        String response = restTemplate.getForObject("/all-item", String.class);
//        JSONAssert.assertEquals("[{},{},{}]", response, false);
//        JSONAssert.assertEquals("[{id:1001,value:200},{id:1002},{id:1003}]", response, false);
//    }
//
//    @Test
//    public void contextLoads2()  {
//
//
//        ResponseEntity<List> response = restTemplate.getForEntity("/all-item", List.class);
//        List<Item> lista = response.getBody();
//        Assert.assertTrue(response.getStatusCode().is2xxSuccessful());
//        Assert.assertEquals(3, response.getBody().size());
////        Item item = lista.get(0);
////        Assert.assertEquals(200,lista.get(0).getValue());
//    }
//}
