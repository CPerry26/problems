package com.codyperry.java_problems;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for(int idx = 0; idx < nums.length; idx++) {
            for (int jdx = idx + 1; jdx < nums.length; jdx++) {
                if ((nums[idx] + nums[jdx]) == target) {
                    indices[0] = idx;
                    indices[1] = jdx;
                }
            }
        }

        return indices;
    }
}
