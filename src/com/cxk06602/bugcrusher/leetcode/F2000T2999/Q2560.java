package com.cxk06602.bugcrusher.leetcode;

public class Q2560 {
    static void main() {
//        System.out.println(new Solution().minCapability(new int[]{2,3,5,9}, 2));
    }
}
//class Solution {
//    public int minCapability(int[] nums, int k) {
//        int left = 1000000000;
//        int right = 1;
//        for(int num : nums){
//            right = Math.max(num, right);
//            left = Math.min(num, left);
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
//    private boolean check(int[] nums, int k, int ability){
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] <= ability){
//                count++;
//                i++;
//            }
//        }
//        return count >= k;
//    }
//}