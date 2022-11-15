package com.higginsn.amazon.grokking.mergeintervals;

import com.higginsn.models.Interval;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MergeIntervalsTest {

    @Test
    public void example1() {
        List<Interval> input = Arrays.asList(new Interval(1, 4), new Interval(2, 5), new Interval(7, 9));
        List<Interval> expected = List.of(new Interval(1, 5), new Interval(7, 9));

        Assertions.assertEquals(expected, MergeIntervals.merge(input));
    }

    @Test
    public void example2() {
        List<Interval> input = Arrays.asList(new Interval(6, 7), new Interval(2, 4), new Interval(5, 9));
        List<Interval> expected = List.of(input.get(1), input.get(2));

        Assertions.assertEquals(expected, MergeIntervals.merge(input));
    }

    @Test
    public void example3() {
        List<Interval> input = Arrays.asList(new Interval(1, 4), new Interval(2, 4), new Interval(5, 9));
        List<Interval> expected = List.of(new Interval(1, 6));

        Assertions.assertEquals(expected, MergeIntervals.merge(input));
    }
}