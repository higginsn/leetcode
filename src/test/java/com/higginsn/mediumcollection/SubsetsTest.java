package com.higginsn.mediumcollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SubsetsTest {

    private final Subsets sut = new Subsets();

    @Test
    public void example1() {
        int[] input = new int[]{1, 2, 3};
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(1, 2),
                List.of(3),
                List.of(1, 3),
                List.of(2, 3),
                List.of(1, 2, 3));

        List<List<Integer>> result = sut.subsets(input);
        assertArrayListEqualityWithoutOrder(expected, result);
    }

    @Test
    public void example2() {
        int[] input = new int[]{0};
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(0)
        );

        List<List<Integer>> result = sut.subsets(input);
        assertArrayListEqualityWithoutOrder(expected, result);
    }

    private <T> void assertArrayListEqualityWithoutOrder(List<T> expected, List<T> actual) {
        Assertions.assertEquals(expected.size(), actual.size());
        Assertions.assertTrue(expected.containsAll(actual));
        Assertions.assertTrue(actual.containsAll(expected));
    }

}