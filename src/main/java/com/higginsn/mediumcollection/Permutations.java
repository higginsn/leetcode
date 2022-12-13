package com.higginsn.mediumcollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/109/backtracking/795/
 */
public class Permutations {

    List<List<Integer>> result = new ArrayList<>();

    // input: array of arbitrary integers
    // output: all possible permutations of elements in the array
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> inputList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        permuteHelper(inputList, new ArrayList<>());
        return result;
    }

    private void permuteHelper(List<Integer> remainingNums, List<Integer> path) {
        if (remainingNums.isEmpty()) {
            result.add(List.copyOf(path));
            return;
        }

        for (int i = 0; i < remainingNums.size(); i++) {
            int selectedNum = remainingNums.remove(i);
            path.add(selectedNum);
            permuteHelper(remainingNums, path);
            remainingNums.add(i, selectedNum);
            path.remove(path.size() - 1);
        }
    }
}
