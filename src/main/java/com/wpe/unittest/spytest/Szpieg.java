package com.wpe.unittest.spytest;

public class Szpieg {
    public String szpieguj(String kraj, String co){
        System.out.println("Szpieguje kraj "+kraj+", kradne "+co);
        return szpieguje(kraj)+" "+ ukradnij(co);
    }

    String ukradnij(String co){
        System.out.println("Ukradlem "+co);
        return co;
    }

    String szpieguje(String kraj){
        System.out.println("Szpieguje w "+kraj);
        return kraj;
    }
}
