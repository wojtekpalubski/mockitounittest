package com.wpe.unittest.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Slownik {
    private List<String> slownik1 = Arrays.asList("AA", "BB", "CC");

    List<String> getPozycjeSlownika2() {
        return slownik2;
    }

    private List<String> slownik2 = Arrays.asList("AA2", "BB2", "CC2");

    public List<String> getSlownik() {
        List<String> slownik = new ArrayList<>();
        slownik.addAll(getPozycjeSlownika1());
        slownik.addAll(getPozycjeSlownika2());
        return slownik;
    }

    List<String> getPozycjeSlownika1() {
        return slownik1;
    }
}
