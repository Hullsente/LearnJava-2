package com.cxk06602.bugcrusher.leetcode;

public class Q2529 {
    static void main() {
        //3
//        System.out.println(new Solution().maximumCount(new int[]{-2,-2,-1}));
    }
}

//class Solution {
//    public int maximumCount(int[] nums) {
//        if(nums.length == 1){
//            if(nums[0] == 0)return 0;
//            else return 1;
//        }
//        int firstPosIndex = binary(nums, 1);
//        int lastNegIndex = binary(nums, 0) - 1;
//        int posCount = nums.length - firstPosIndex;
//        int negCount = lastNegIndex + 1;
//        return Math.max(posCount, negCount);
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