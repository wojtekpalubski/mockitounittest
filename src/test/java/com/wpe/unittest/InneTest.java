package com.wpe.unittest;

import org.junit.Test;
import org.springframework.util.comparator.Comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InneTest {

    @Test
    public void LambdaSort(){
        List<String> strings =
                Arrays.asList("this", "is", "a", "list", "of", "strings");
        List<String> sorted = strings.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);

        List<String> sorted2 = strings.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        sorted2.forEach(System.out::println);

        List<Integer> liczby = Arrays.asList(1, 3, 15, 9, 7, 8);
        List<Integer> liczbyPosortowane =liczby.stream()
                .sorted(Integer::compareTo)
                .sorted()
                .collect(Collectors.toList());
        liczbyPosortowane.forEach(System.out::println);

        List<String> sorted3=strings.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
        sorted3.forEach(System.out::println);
    }
}
