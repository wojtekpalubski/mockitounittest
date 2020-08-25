package com.wpe.unittest.business;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class KlasaPrywatnaTest {
    KlasaPrywatna kp;

    @Before
    public void setUp() throws Exception {
        kp=new KlasaPrywatna();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void toString_test() {
        kp.setNapis("tostring");
        assertThat(kp.getNapis(),is("tostring"));
    }

    @Test
    public void equals() {
    }

    @Test
    public void hashCode_test() {
    }

    @Test
    public void getNapis() {
    }
    @Test
    public void getNapisUpper() {
        kp.setNapis("tostringupper");
        assertThat(kp.getNapis(),is("tostringupper"));
    }

    @Test
    public void setNapis() {
    }
}