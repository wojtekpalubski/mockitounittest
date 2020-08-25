package com.wpe.unittest.model;

import java.util.ArrayList;
import java.util.List;

public class Akcja_15 extends BaseAkcja implements AkcjaInterface {
    private List<String> parametry = new ArrayList<>();

    @Override
    public void przetworz_parametry() {
        parametry.addAll(dodajParametry15());

    }

    @Override
    public List<String> getParametry() {
        return parametry;
    }

    private List<String> dodajParametry15(){
        List<String> parametry = new ArrayList<>();
        parametry.add(utworz_parametr("a", "A"));
        parametry.add(utworz_parametr("b", "B"));
        parametry.add(utworz_parametr("c", "C"));
        return parametry;
    }
}
