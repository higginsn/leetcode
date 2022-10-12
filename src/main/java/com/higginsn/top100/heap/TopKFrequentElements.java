package com.higginsn.top100.heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 */
public class TopKFrequentElements {

    private final Map<Integer, Integer> mapOfValueToCounter = new HashMap<>();

    public int[] topKFrequent(int[] nums, int k) {
        for (int num : nums) {
            int existingCounter = mapOfValueToCounter.getOrDefault(num, 0);
            mapOfValueToCounter.put(num, existingCounter + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int key : mapOfValueToCounter.keySet()) {
            buckets[mapOfValueToCounter.get(key)].add(key);
        }

        List<Integer> flattened = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0; i--) {
            flattened.addAll(buckets[i]);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = flattened.get(i);
        }
        return result;
    }



// O(Nlogk) solution b/c PQ
//    private final Map<Integer, Integer> mapOfValueToCounter = new HashMap<>();
//    private final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) ->
//            mapOfValueToCounter.get(o1) - mapOfValueToCounter.get(o2));
//
//    public int[] topKFrequent(int[] nums, int k) {
//        for (int num : nums) {
//            int existingCounter = mapOfValueToCounter.getOrDefault(num, 0);
//            mapOfValueToCounter.put(num, existingCounter + 1);
//        }
//
//        priorityQueue.addAll(mapOfValueToCounter.keySet());
//
//        int[] result = new int[k];
//        for (int i = 0; i < k; i++) {
//            result[i] = priorityQueue.poll();
//        }
//
//        return result;
//    }

}
