package com.higginsn.leetcode.algorithms.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TimeBasedKeyValueStoreTest {

    private static final String KEY = "foo";
    private static final String VALUE1 = "bar";
    private static final String VALUE2 = "bar2";

    private TimeBasedKeyValueStore sut;

    @BeforeEach
    public void setup() {
        sut = new TimeBasedKeyValueStore();
    }

    @Test
    public void getValueWithExactTimestamp() {
        sut.set(KEY, VALUE1, 1);
        Assertions.assertEquals(VALUE1, sut.get(KEY, 1));
    }

    @Test
    public void getValueWithTimestampInTheFuture() {
        sut.set(KEY, VALUE1, 1);
        Assertions.assertEquals(VALUE1, sut.get(KEY, 3));
    }

    @Test
    public void getValueWithMultipleEntriesAndExactTimestamp() {
        sut.set(KEY, VALUE1, 1);
        sut.set(KEY, VALUE2, 4);
        Assertions.assertEquals(VALUE2, sut.get(KEY, 4));
    }

    @Test
    public void getValueWithMultipleEntriesAndTimestampInTheFuture() {
        sut.set(KEY, VALUE1, 1);
        sut.set(KEY, VALUE2, 4);
        Assertions.assertEquals(VALUE2, sut.get(KEY, 5));
    }

}