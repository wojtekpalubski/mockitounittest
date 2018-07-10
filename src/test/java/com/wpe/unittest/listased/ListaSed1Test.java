package com.wpe.unittest.listased;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.mockito.Mockito.mock;

public class ListaSed1Test {

    @Test
    public void listaDokumentow1_test(){
        ListaSed ListaSedMock=Mockito.mock(ListaSed.class);
        Mockito.when(ListaSedMock.getListaSpraw()).thenReturn(Arrays.asList(2l,4l));
        SprawyService SprawyServiceMock=Mockito.mock(SprawyService.class);
        Mockito.when(SprawyServiceMock.getListaSpraw()).thenReturn(Arrays.asList(2l,4l));

        ListaSed listaSed=new ListaSed();
        System.out.println(listaSed.getListaDokumentow());
        System.out.println(ListaSedMock.getListaDokumentow());

    }
}
