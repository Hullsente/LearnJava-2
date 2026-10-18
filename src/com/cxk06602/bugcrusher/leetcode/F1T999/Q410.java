package com.cxk06602.bugcrusher.leetcode;

public class Q410 {
    static void main() {
//        System.out.println(new Solution().splitArray(new int[]{7,2,5,10,8}, 2));;
    }
}

//class Solution {
//    public int splitArray(int[] nums, int k) {
//        int left = 0;
//        int right = 0;
//        for(int n : nums){
//            left = Math.max(left, n);
//            right += n;
//        }
//        right++;
//        left--;
//
//        while(left + 1 < right){
//            int mid = left + right >>> 1;
//            if(check(nums, k, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] nums, int k, int max){
//        int sum = 0;
//        int count = 1;
//        for (int num : nums) {
//            if (sum + num <= max) {
//                sum += num;
//                continue;
//            }
//            if (count == k) {
//                return false;
//            }
//            count++;
//            sum = num;
//        }
//        return true;
//    }
//}
