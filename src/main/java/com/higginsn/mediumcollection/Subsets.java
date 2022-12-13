package com.higginsn.mediumcollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/109/backtracking/796/
 */
public class Subsets {

    private List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0) {
            return results;
        }
        results.add(Collections.emptyList());

        List<Integer> inputList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        subsetsHelper(inputList, 0, new ArrayList<>());

        return results;
    }

    private void subsetsHelper(List<Integer> inputList, int first, List<Integer> subset) {
        if (inputList.isEmpty()) {
            return;
        }

        for (int i = first; i < inputList.size(); i++) {
            int temp = inputList.get(i);
            subset.add(temp);
            results.add(List.copyOf(subset));
            subsetsHelper(inputList, i + 1, subset);
            subset.remove(subset.size() - 1);
        }
    }

}
