package com.cxk06602.bugcrusher.leetcode.F3000T3999;

public class Q3152 {
    static void main() {
    }
}
//class Solution {
//    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
//        int[] special = new int[nums.length + 1];
//        boolean[] ans = new boolean[queries.length];
//        for (int i = 0; i < nums.length - 1; i++)
//            special[i + 1] = special[i] + (((nums[i] & 1) ^ (nums[i + 1] & 1)) == 0 ? 1 : 0);
//        for (int i = 0; i < queries.length; i++)
//            ans[i] = special[queries[i][0]] == special[queries[i][1]];
//        return ans;
//    }
//}