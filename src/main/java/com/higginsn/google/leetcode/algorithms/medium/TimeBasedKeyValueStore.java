package com.higginsn.google.leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/time-based-key-value-store/
 * Design a time-based key-value data structure that can store multiple values for the same key at different timestamps
 * and retrieve the key's value at a certain timestamp.
 */
public class TimeBasedKeyValueStore {

    private static final String DEFAULT_STRING = "";

    Map<String, TreeMap<Integer, String>> mapOfKeyToBST;

    // Initializes data stuctures
    public TimeBasedKeyValueStore() {
        mapOfKeyToBST = new HashMap<>();
    }

    // Stores the key with the value at a given timestamp
    public void set(String key, String value, int timestamp) {
        mapOfKeyToBST.putIfAbsent(key, new TreeMap<>());
        mapOfKeyToBST.get(key).put(timestamp, value);
    }

    // Returns a value such that set was called previously, with timestamp_prev <= timestamp. If there are multiple such
    // values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".
    public String get(String key, int timestamp) {
        TreeMap<Integer, String> treeMap = mapOfKeyToBST.get(key);
        if (treeMap == null) {
            return DEFAULT_STRING;
        }

        Map.Entry<Integer, String> entry = treeMap.floorEntry(timestamp);
        if (entry == null) {
            return DEFAULT_STRING;
        }

        return entry.getValue();
    }


}
