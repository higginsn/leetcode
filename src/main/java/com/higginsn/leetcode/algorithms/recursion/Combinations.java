package com.higginsn.leetcode.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/learn/card/recursion-ii/472/backtracking/2798/
 */
public class Combinations {

    private List<List<Integer>> result;
    private int n;
    private int k;

    public List<List<Integer>> combine(int n, int k) {
        this.result = new ArrayList<>();
        this.n = n;
        this.k = k;

        backtrack(new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(List<Integer> currentList, int currentN) {
        if (currentList.size() == k) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = currentN + 1; i <= n; i++) {
            currentList.add(i);
            backtrack(currentList, i);
            currentList.remove(currentList.size() - 1);
        }
    }

}
