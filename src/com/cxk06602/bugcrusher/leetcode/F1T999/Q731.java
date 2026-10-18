package com.cxk06602.bugcrusher.leetcode;

import java.util.Arrays;

public class Q731 {
    static void main() {
//        System.out.println(new Solution().numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
    }
}
//class Solution {
//    public int numSubarrayProductLessThanK(int[] nums, int k) {
//        if (k <= 1) {
//            return 0;
//        }
//        int n = nums.length;
//        int count = 0, left = 0, mul = 1;
//        for (int i = 0; i < n; i++) {
//            mul *= nums[i];
//            while(mul >= k){
//                mul /= nums[left];
//                left++;
//            }
//            count += i - left + 1;
//        }
//        return count;
//    }
//}