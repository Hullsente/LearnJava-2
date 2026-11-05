package com.cxk06602.bugcrusher.leetcode.F3000T3999;

public class Q3427 {
    static void main() {

    }
}
//class Solution {
//    public int subarraySum(int[] nums) {
//        int result = 0;
//        int[] sum = new int[nums.length + 1];
//        for (int i = 0; i < nums.length; ++i) {
//            sum[i + 1] = sum[i] + nums[i];
//        }
//        for (int i = 0; i < nums.length; ++i) {
//            result += sum[i + 1] - sum[Math.max(0, i - nums[i])];
//        }
//        return result;
//    }
//}