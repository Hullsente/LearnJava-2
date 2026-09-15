package com.cxk06602.bugcrusher.leetcode;

public class Q34 {
    static void main() {
//        for(int n : new Solution().searchRange(new int[]{5,7,7,8,8,10}, 6)){
//            System.out.println(n);
//        }
    }
}
//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//        int start = binary(nums, target);
//        if(start == nums.length || nums[start] != target){
//            return new int[]{-1,-1};
//        }
//        int end = binary(nums, target + 1) - 1;
//        return new int[]{start, end};
//    }
//    private int binary(int[] nums, int target){
//        int left = 0;
//        int right = nums.length - 1;
//        while(left <= right){
//            int mid = left + (right - left) / 2;
//            if(nums[mid] >= target){
//                right = mid - 1;
//            }else{
//                left = mid + 1;
//            }
//        }
//        return left;
//    }
//}