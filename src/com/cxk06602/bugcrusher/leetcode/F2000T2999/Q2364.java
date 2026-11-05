package com.cxk06602.bugcrusher.leetcode.F2000T2999;

import java.util.HashMap;

public class Q2364 {
    static void main() {

    }
}
//class Solution {
//    public long countBadPairs(int[] nums) {
//        int n = nums.length;
//        long ans = (long) n * (n - 1) / 2;
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int k = nums[i] - i;
//            int orDefault = hashMap.getOrDefault(k, 0);
//            ans -= orDefault;
//            hashMap.put(k, orDefault + 1);
//        }
//        return ans;
//    }
//}