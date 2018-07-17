package com.wpe.unittest.business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SlownikTest {

    @Test
    public void getSlownik_oryginaly() {
        Slownik slownik = spy(new Slownik());
        System.out.println(slownik.getSlownik());
    }
    @Test
    public void getSlownik_podmieniony1() {
        Slownik slownik = spy(new Slownik());
        when(slownik.getPozycjeSlownika1()).thenReturn(Arrays.asList("KK1", "LL1"));
        System.out.println(slownik.getSlownik());
    }
    @Test
    public void getSlownik_podmieniony2() {
        Slownik slownik = spy(new Slownik());
        when(slownik.getPozycjeSlownika2()).thenReturn(Arrays.asList("KK2", "LL2"));
        System.out.println(slownik.getSlownik());
    }
    @Test
    public void getSlownik_podmienione_oba() {
        Slownik slownik = spy(new Slownik());
        when(slownik.getPozycjeSlownika1()).thenReturn(Arrays.asList("KK1", "LL1"));
        when(slownik.getPozycjeSlownika2()).thenReturn(Arrays.asList("KK2", "LL2"));
        System.out.println(slownik.getSlownik());
    }
}