package com.cxk06602.bugcrusher.leetcode;

import java.util.Arrays;

public class Q2389 {
    static void main() {
//        for(int i : new Solution().answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21})){
//            System.out.print(i + " ");
//        }
    }
}

//class Solution {
//    public int[] answerQueries(int[] nums, int[] queries) {
//        int[] ans = new int[queries.length];
//        Arrays.sort(nums);
//        for (int i = 0; i < queries.length; i++) {
//            ans[i] = getCount(nums, queries[i]);
//        }
//        return ans;
//    }
//    private int getCount(int[] nums, int query){
//        int n = nums.length;
//        int left = 0;
//        int maxLength = 0;
//        long sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += nums[i];
//            while(sum > query){
//                sum -= nums[left];
//                left++;
//            }
//            maxLength = Math.max(maxLength, i - left + 1);
//        }
//        return maxLength;
//    }
//}