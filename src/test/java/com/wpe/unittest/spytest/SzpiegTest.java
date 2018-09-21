package com.wpe.unittest.spytest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class SzpiegTest {

    @Test
    public void ukradnij() {
        Szpieg szpieg=spy(new Szpieg());
//        when(szpieg.ukradnij(anyString())).thenReturn("QQQ");
        doReturn("QQQ").when(szpieg).ukradnij(anyString());

        String wynik=szpieg.szpieguj("Polska","rakieta");
        System.out.println(wynik);
        assertThat(wynik, is("Polska QQQ"));
    }
}