package com.cxk06602.bugcrusher.leetcode.F2000T2999;

public class Q2874 {
    static void main() {
//        System.out.println(new Solution().maximumTripletValue(new int[]{1000000,1,1000000}));;
    }
}

//class Solution {
//    public long maximumTripletValue(int[] nums) {
//        long ans = 0;
//        int[] maxKNums = new int[nums.length];
//        int maxK = 1;
//        for(int i = nums.length - 1; i >= 0; --i){
//
//            maxKNums[i] = maxK;
//            maxK = Math.max(maxK, nums[i]);
//        }
//        int maxI = nums[0];
//        for (int j = 1; j < nums.length - 1; ++j) {
//            ans = Math.max(ans, ((long) maxI - nums[j]) * maxKNums[j]);
//            maxI = Math.max(maxI, nums[j]);
//        }
//        return ans;
//    }
//}