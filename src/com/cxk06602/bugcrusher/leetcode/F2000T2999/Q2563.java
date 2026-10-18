package com.cxk06602.bugcrusher.leetcode;

import java.util.Arrays;

public class Q2563 {
    static void main() {
//        System.out.println(new Solution().countFairPairs(new int[]{0,1,7,4,4,5}, 3, 6));
    }
}

//class Solution {
//    public long countFairPairs(int[] nums, int lower, int upper) {
//        long count = 0;
//        Arrays.sort(nums);
//        //0 1 4 4 5 7
//        //3 6
//
//        //0 -> 4 4 5
//        //1 -> 4 4 5 7
//        //result = 6
//        for (int i = 0; i < nums.length; i++) {
//            int n = nums[i];
//            int indexMin = binarySearch(nums, n + lower, i);
//            int indexMax = binarySearch(nums, n + upper + 1, i);
//            count += indexMax - indexMin;
//        }
//        return count;
//    }
//    private int binarySearch(int[] arr, int target, int temp){
//        int left = 0;
//        int right = temp - 1;
//        while(left <= right){
//            int mid = left + (right - left) / 2;
//            if(arr[mid] >= target){
//                right = mid - 1;
//            }else{
//                left = mid + 1;
//            }
//        }
//        return left;
//    }
//}