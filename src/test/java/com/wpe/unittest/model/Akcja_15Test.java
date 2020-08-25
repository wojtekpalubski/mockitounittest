package com.wpe.unittest.model;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Akcja_15Test {
    @Test
    public void test1() {
        AkcjaInterface a=new Akcja_15();
        a.przetworz_parametry();
        List<String> parametry=a.getParametry();
        System.out.println(parametry);
    }
}