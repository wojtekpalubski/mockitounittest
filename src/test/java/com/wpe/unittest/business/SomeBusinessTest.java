package com.wpe.unittest.business;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeBusinessTest {

    @Test
    public void calculateSum_test(){
        SomeBusinessImpl b=new SomeBusinessImpl();
        int calculateSum = b.calculateSum(new int[]{1, 2, 3});
        int exp=6;
        assertEquals(exp,calculateSum);
    }
    @Test
    public void calculateSumEmpty_test(){
        SomeBusinessImpl b=new SomeBusinessImpl();
        int calculateSum = b.calculateSum(new int[]{});
        int exp=0;
        assertEquals(exp,calculateSum);
    }
}
