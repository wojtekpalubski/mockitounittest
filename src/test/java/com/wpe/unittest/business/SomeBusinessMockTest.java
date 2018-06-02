package com.wpe.unittest.business;

import com.wpe.unittest.data.SomeDataService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {

    @InjectMocks
    SomeBusinessImpl b;

    @Mock
    SomeDataService dataServiceMock;

    @Before
    public void before() {
        b.setSomeDataService(dataServiceMock);
    }

    @Test
    public void calculateSumUsingService_test() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1, 2, 3});


        assertEquals(6, b.calculateSumUsingService());
    }

    @Test
    public void calculateSumUsingServiceEmpty_test() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(0, b.calculateSumUsingService());
    }
    @Test
    public void calculateSumUsingServiceOnevalue_test() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{7});
        assertEquals(7, b.calculateSumUsingService());
    }
}

