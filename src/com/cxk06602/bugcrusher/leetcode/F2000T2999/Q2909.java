package com.cxk06602.bugcrusher.leetcode.F2000T2999;

public class Q2909 {
    static void main() {

    }
}
//class Solution {
//    public int minimumSum(int[] nums) {
//        int[] suf = new int[nums.length];
//        int min = 100000000;
//        for (int i = nums.length - 1; i >= 0; --i) {
//            min = Math.min(min, nums[i]);
//            suf[i] = min;
//        }
//        min = 100000000;
//        int minSum = Integer.MAX_VALUE;
//        for (int j = 1; j < nums.length; ++j) {
//            min = Math.min(min, nums[j - 1]);
//            if(nums[j] > min && nums[j] > suf[j])minSum = Math.min(minSum, min + nums[j] + suf[j]);
//        }
//        return minSum == Integer.MAX_VALUE ? -1 : minSum;
//    }
//}