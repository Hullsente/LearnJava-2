package com.cxk06602.bugcrusher.leetcode;

public class Q2439 {
    static void main() {

    }
}

//class Solution {
//    public int minimizeArrayValue(int[] nums) {
//        int left = nums[0] - 1;
//        int right = 0;
//        for (int num : nums) {
//            right = Math.max(right, num);
//        }
//        right++;
//        while(left + 1 < right){
//            int mid = left + right >>> 1;
//            if(check(nums, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] nums, int max){
//        long extra = 0;
//        for (int i = nums.length - 1; i > 0; i--) {
//            long thisIndexShouldNum = nums[i] + extra;
//            extra = Math.max(thisIndexShouldNum - max, 0);
//        }
//        return extra + nums[0] <= max;
//    }
//}