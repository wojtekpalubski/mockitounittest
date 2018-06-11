package com.wpe.unittest.business;

import com.wpe.unittest.data.SomeDataService;

import java.util.Arrays;
import java.util.OptionalInt;

public class SomeBusinessImpl {
    private SomeDataService someDataService;

    public int calculateSum(int[] data){
        int sum=0;
        for (int value:data){
            sum+=value;
        }
        return sum;
    }
    public int calculateSumFunctional(int[] data){
        return Arrays.stream(data).reduce(Integer::sum).orElse(0);
    }

    public int calculateSumUsingService(){
        int sum=0;
        int[] data=someDataService.retrieveAllData();
        for (int value:data){
            sum+=value;
        }
        return sum;
    }

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }
}
