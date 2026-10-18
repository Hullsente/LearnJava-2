package com.cxk06602.bugcrusher.leetcode;

public class Q930 {
    static void main() {
        //28
//        System.out.println(new Solution().numSubarraysWithSum(new int[]{0,0,1,0,0,0,1,1,0,0,1,0,0,1,0,0,0,1}, 3));
    }
}
//class Solution {
//    public int numSubarraysWithSum(int[] nums, int goal) {
//        int n = nums.length;
//        int count = 0;
//        int sum1 = 0, sum2 = 0;
//        int left1 = 0, left2 = 0;
//        for (int i = 0; i < n; i++) {
//            sum1 += nums[i];
//            while(left1 <= i && sum1 >= goal){
//                sum1 -= nums[left1];
//                left1++;
//            }
//            count += left1;
//
//            sum2 += nums[i];
//            while(sum2 > goal){
//                sum2 -= nums[left2];
//                left2++;
//            }
//            count -= left2;
//        }
//        return count;
//    }
//}