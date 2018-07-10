package com.wpe.unittest.listased;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaSed {

//    @Autowired
    SprawyService sprawyService=new SprawyService();

    public void setSprawyService(SprawyService sprawyService) {
        this.sprawyService = sprawyService;
    }

    public List<Long> getListaSpraw() {
        return Arrays.asList(1l, 3l, 5l, 7l);
    }

    public List<DokumentSed> getListaDokumentow(){
        return sprawyService.getListaSpraw().stream().map(s->{return new DokumentSed(s);}).collect(Collectors.toList());
    }
}
