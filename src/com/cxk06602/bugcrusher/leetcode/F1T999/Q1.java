package com.cxk06602.bugcrusher.leetcode.F1T999;

import java.util.HashMap;

public class Q1 {
    static void main() {
        int[] ints = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int anInt : ints) {
            System.out.println(anInt + " ");
        }
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{};
    }
}