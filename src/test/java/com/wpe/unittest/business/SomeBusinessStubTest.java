package com.wpe.unittest.business;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SomeBusinessStubTest {

    @Test
    public void calculateSumUsingService_test(){
        SomeBusinessImpl b=new SomeBusinessImpl();
        b.setSomeDataService(new SomeDataServiceStub());
        int calculateSum = b.calculateSumUsingService();
        int exp=6;
        assertEquals(exp,calculateSum);
    }
    @Test
    public void calculateSumUsingServiceEmpty_test(){
        SomeBusinessImpl b=new SomeBusinessImpl();
        int calculateSum = b.calculateSum(new int[]{});
        int exp=0;
        assertEquals(exp,calculateSum);
    }
    @Test
    public void calculateSumUsingServiceEmptyFunctional_test(){
        SomeBusinessImpl b=new SomeBusinessImpl();
        int calculateSum = b.calculateSumFunctional(new int[]{});
        int exp=0;
        assertEquals(exp,calculateSum);
    }
}

class SomeDataServiceStub implements com.wpe.unittest.data.SomeDataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{1,2,3};
    }
}