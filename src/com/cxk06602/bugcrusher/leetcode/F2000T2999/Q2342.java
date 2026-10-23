package com.cxk06602.bugcrusher.leetcode.F2000T2999;

import java.util.Arrays;

public class Q2342 {
    static void main() {

    }
}
class Solution {
    public int maximumSum(int[] nums) {
        int max = -1;
        int[] hashMap = new int[82];
        Arrays.fill(hashMap, Integer.MIN_VALUE);
        for (int num : nums) {
            int sum = 0;
            for (int x = num; x > 0; x /= 10) {
                sum += x % 10;
            }
            max = Math.max(max, hashMap[sum] + num);
            hashMap[sum] = Math.max(hashMap[sum], num);
        }
        return max;
    }
}