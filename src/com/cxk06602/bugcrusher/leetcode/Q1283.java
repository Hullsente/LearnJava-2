package com.cxk06602.bugcrusher.leetcode;

public class Q1283 {
    static void main() {

    }
}


//class Solution {
//    public int smallestDivisor(int[] nums, int threshold) {
//        int left = 0;
//        int right = 0;
//        for(int x : nums){
//            right = Math.max(x, right);
//        }
//        while(left + 1 < right){
//            int mid = left + right >>> 1;
//            if(check(nums, mid, threshold)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] arr, int division, int threshold){
//        int sum = 0;
//        for (int j : arr) {
//            sum += (j + division - 1) / division;
//            if (sum > threshold) {
//                return false;
//            }
//        }
//        return true;
//    }
//}