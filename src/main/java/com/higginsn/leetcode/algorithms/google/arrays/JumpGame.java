package com.higginsn.leetcode.algorithms.google.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/jump-game/solution/
 */
public class JumpGame {

    private int[] nums;
    private List<Boolean> indexHealth;

    public boolean canJump(int[] nums) {
        this.nums = nums;
        this.indexHealth = new ArrayList<>(Collections.nCopies(nums.length, null));
        indexHealth.set(nums.length - 1, true);
        return jump(0);
    }

    private boolean jump(int index) {
        if (indexHealth.get(index) != null) {
            return indexHealth.get(index);
        }

        boolean success = false;
        for (int i = 1; i <= nums[index] && i < nums.length; i++) {
            success = jump(index + i);
            if (success) {
                break;
            }
        }

        indexHealth.set(index, success);
        return success;
    }

}
