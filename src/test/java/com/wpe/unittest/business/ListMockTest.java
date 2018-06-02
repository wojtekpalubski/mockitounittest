package com.wpe.unittest.business;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ListMockTest {
    @Test
    public void listSize_test() {
        List mock = mock(List.class);
        when(mock.size()).thenReturn(5);
        assertEquals(5, mock.size());
    }

    @Test
    public void listSize2_test() {
        List mock = mock(List.class);
        when(mock.size()).thenReturn(5).thenReturn(10);
        assertEquals(5, mock.size());
        assertEquals(10, mock.size());
    }

    @Test
    public void listSize3_test() {
        List mock = mock(List.class);
        when(mock.get(anyInt())).thenReturn("qwert").thenReturn("qwerty");
        assertEquals("qwert", mock.get(0));
        assertEquals("qwerty", mock.get(0));
        assertEquals("qwerty", mock.get(1));
    }

    @Test
    public void methodVerify() {
        List<String> mock = mock(List.class);
        String value = mock.get(0);
        verify(mock).get(0);
        verify(mock).get(anyInt());
        verify(mock, times(1)).get(anyInt());
        verify(mock, times(1)).get(anyInt());
        verify(mock, timeout(1)).get(anyInt());
    }

    @Test
    public void argumentCapture() {
        List<String> mock = mock(List.class);
        mock.add("argument");

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock).add(captor.capture());
        assertEquals("argument", captor.getValue());
    }
    @Test
    public void multipleArgumentCapture() {
        List<String> mock = mock(List.class);
        mock.add("argument1");
        mock.add("argument2");

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
//        verify(mock,atLeastOnce()).add(anyString());
        verify(mock,atLeastOnce()).add(captor.capture());
        assertEquals("argument1", captor.getAllValues().get(0));
        assertEquals("argument2", captor.getAllValues().get(1));
    }

    @Test
    public void mocking(){
        ArrayList arrayListMock=mock(ArrayList.class);
        System.out.println(arrayListMock.get(0));
        System.out.println(arrayListMock.size());
        arrayListMock.add("test1");
        arrayListMock.add("test2");
        System.out.println(arrayListMock.size());
        when(arrayListMock.size()).thenReturn(5);
        System.out.println(arrayListMock.size());
    }
    @Test
    public void spying(){
        ArrayList arrayListSpy=spy(ArrayList.class);
        arrayListSpy.add("test0");
        System.out.println(arrayListSpy.get(0));
        System.out.println(arrayListSpy.size());
        arrayListSpy.add("test1");
        arrayListSpy.add("test2");
        System.out.println(arrayListSpy.size());
        when(arrayListSpy.size()).thenReturn(5);
        arrayListSpy.add("test3");
        System.out.println(arrayListSpy.size());
    }
}
