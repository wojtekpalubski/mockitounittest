package com.wpe.unittest;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://github.com/json-path/JsonPath
 * http://xunitpatterns.com
 */
public class JsonPathTest {
    @Test
    public void jsonPath_test() {
        String response="[\n" +
                "  {\n" +
                "    \"id\": 1000,\n" +
                "    \"name\": \"pencil\",\n" +
                "    \"quantity\": 5\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1001,\n" +
                "    \"name\": \"pen\",\n" +
                "    \"quantity\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1002,\n" +
                "    \"name\": \"eraser\",\n" +
                "    \"quantity\": 10\n" +
                "  }\n" +
                "]";

        DocumentContext context = JsonPath.parse(response);
        int length = context.read("$.length()");
        assertThat(length).isEqualTo(3);

        List<Integer> ids=context.read("$..id");
        assertThat(ids).hasSize(3).containsExactly(1000,1001,1002);

        System.out.println(context.read("$.[1]").toString());
        System.out.println(context.read("$.[0:1]").toString());
        System.out.println(context.read("$.[0:2]").toString());
        System.out.println(context.read("$.[?(@.name=='eraser')]").toString());
        System.out.println(context.read("$.[?(@.quantity==5)]").toString());
        System.out.println(context.read("$.[?(@.name=='eraser')].quantity").toString());
        System.out.println(context.read("$.[0:2].id").toString());
    }
}
