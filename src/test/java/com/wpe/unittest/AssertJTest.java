package com.wpe.unittest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {
    @Test
    public void assertj1() {
        List<Integer> numbers = Arrays.asList(12, 15, 45);
//        assertThat(numbers, hasSize(3));
        assertThat(numbers)
                .hasSize(3)
                .contains(12, 15)
                .allMatch(n -> n > 10)
                .allMatch(n -> n < 100)
                .noneMatch(n -> n < 0);

//        assertThat(numbers, hasItems(12, 45));
//        assertThat(numbers, everyItem(greaterThan(10)));
//        assertThat(numbers, everyItem(lessThan(100)));
//
//        assertThat("", isEmptyOrNullString());
        assertThat("").isEmpty();

//        assertThat("ABCDE", containsString("BCD"));
//        assertThat("ABCDE", startsWith("ABC"));
//        assertThat("ABCDE", endsWith("DE"));
        assertThat("ABCDE")
                .contains("BCD")
                .startsWith("ABC")
                .endsWith("DE");
    }
}
