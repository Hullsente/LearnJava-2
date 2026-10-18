package com.cxk06602.bugcrusher.leetcode;

public class Q2302 {
}
//class Solution {
//    public long countSubarrays(int[] nums, long k) {
//        int n = nums.length;
//        long count = 0, left = 0, sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += nums[i];
//            while(sum * (i - left + 1) >= k){
//                sum -= nums[(int)left];
//                left++;
//            }
//            count += i - left + 1;
//        }
//        return count;
//    }
//}