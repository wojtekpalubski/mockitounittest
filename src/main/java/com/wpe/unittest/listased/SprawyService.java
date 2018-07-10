package com.wpe.unittest.listased;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SprawyService {
    public List<Long> getListaSpraw() {
        return Arrays.asList(1l, 3l, 5l, 7l);
    }
}
