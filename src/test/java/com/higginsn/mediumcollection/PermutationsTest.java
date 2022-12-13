package com.higginsn.mediumcollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PermutationsTest {

    private final Permutations sut = new Permutations();

    @Test
    public void example1() {
        int[] input = new int[]{1, 2, 3};
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        );

        List<List<Integer>> result = sut.permute(input);
        assertArrayListEqualityWithoutOrder(expected, result);
    }

    @Test
    public void example2() {
        int[] input = new int[]{0, 1};
        List<List<Integer>> expected = List.of(
                List.of(0, 1),
                List.of(1, 0)
        );

        List<List<Integer>> result = sut.permute(input);
        assertArrayListEqualityWithoutOrder(expected, result);
    }

    @Test
    public void example3() {
        int[] input = new int[]{1};
        List<List<Integer>> expected = List.of(List.of(1));

        List<List<Integer>> result = sut.permute(input);
        assertArrayListEqualityWithoutOrder(expected, result);
    }

    private <T> void assertArrayListEqualityWithoutOrder(List<T> list1, List<T> list2) {
        Assertions.assertEquals(list1.size(), list2.size());
        Assertions.assertTrue(list1.containsAll(list2));
        Assertions.assertTrue(list2.containsAll(list1));
    }
}