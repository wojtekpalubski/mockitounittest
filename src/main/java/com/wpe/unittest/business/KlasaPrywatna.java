package com.wpe.unittest.business;

import java.util.Objects;

public class KlasaPrywatna {
    private String napis;

    private String getDuzyNapis(){
        return getNapis().toUpperCase();
    }

    @Override
    public String toString() {
        return "KlasaPrywatna{" +
                "napis='" + napis + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KlasaPrywatna that = (KlasaPrywatna) o;
        return Objects.equals(napis, that.napis);
    }

    @Override
    public int hashCode() {

        return Objects.hash(napis);
    }

    public String getNapis() {
        return napis;
    }

    public void setNapis(String napis) {
        this.napis = napis;
    }
}
