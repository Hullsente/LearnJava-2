package com.cxk06602.bugcrusher.leetcode.F2000T2999;

import java.util.Arrays;
import java.util.HashMap;

public class Q2518 {
    static void main() {
//        System.out.println(new Solution().maxSum(new int[]{112,131,411}));
    }
}
//class Solution {
//    public int maxSum(int[] nums) {
//        int max = -1;
//        int[] hashMap = new int[10];
//        for (int i = 0; i < nums.length; i++) {
//            int key = maxPosNum(nums[i]);
//            Integer orDefault = hashMap[key];
//            if(orDefault > 0){
//                max = Math.max(max, orDefault + nums[i]);
//            }
//            hashMap[key] = Math.max(orDefault, nums[i]);
//        }
//        return max;
//    }
//    private int maxPosNum(int n){
//        int max = 0;
//        while(n > 0){
//            max = Math.max(max , n % 10);
//            n /= 10;
//        }
//        return max;
//    }
//}