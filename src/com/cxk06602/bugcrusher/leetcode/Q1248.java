package com.cxk06602.bugcrusher.leetcode;

public class Q1248 {
    static void main() {
        //16
//        System.out.println(new Solution().numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2}, 2));;
    }
}

//class Solution {
//    public int numberOfSubarrays(int[] nums, int k) {
//        int n = nums.length;
//        int count = 0;
//        int left1 = 0, left2 = 0;
//        int count1 = 0, count2 = 0;
//        for (int i = 0; i < n; i++) {
//            if(nums[i] % 2 == 1)count1++;
//            while(left1 <= i && count1 >= k){
//                if(nums[left1] % 2 == 1)count1--;
//                left1++;
//            }
//            count += left1;
//
//            if(nums[i] % 2 == 1)count2++;
//            while(count2 > k){
//                if(nums[left2] % 2 == 1)count2--;
//                left2++;
//            }
//            count -= left2;
//        }
//        return count;
//    }
//}