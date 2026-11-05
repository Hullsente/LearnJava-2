package com.cxk06602.bugcrusher.leetcode.F1000T1999;

public class Q1749 {
    static void main() {

    }
}
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int s = 0, mx = 0, mn = 0;
        for (int num : nums) {
            s += num;
            mx = Math.max(mx, s);
            mn = Math.min(mn, s);
        }
        return mx - mn;
    }
}