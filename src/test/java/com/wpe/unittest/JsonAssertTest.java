package com.wpe.unittest;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

    private final String expectedJson="{\"quantity\":100,\"id\":1,\"name\":\"Ball\",\"price\":10}";

    @Test
    public void testStrict1() throws JSONException {
        String actualJson="{\"quantity\":100,\"id\":1,\"name\":\"Ball\",\"price\":10}";
        JSONAssert.assertEquals(expectedJson,actualJson, true);
    }
    @Test
    public void testStrict2() throws JSONException {
        String actualJson="{quantity  :100,\"id\":1,\"name\":\"Ball\",\"price\":10}";
        JSONAssert.assertEquals(expectedJson,actualJson, true);
    }
    @Test
    public void testNoStrict2value() throws JSONException {
        String actualJson="{\"quantity\"  :100,\"id\":1,\"name\":\"Ball\",\"price\":100}";
        JSONAssert.assertNotEquals(expectedJson,actualJson, false);
    }
    @Test
    public void testNoStrict3() throws JSONException {
        String actualJson="\n{\"quantity\"  :100,\"id\":1,\"name\":\"Ball\",\"price\":10,\"price2\":10}";
        JSONAssert.assertEquals(expectedJson,actualJson, false);
    }
}
