package com.cxk06602.bugcrusher.leetcode.F1000T1999;

import com.mchange.v2.holders.ThreadSafeBooleanHolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q1679 {
    static void main() {
    }
}

//class Solution {
//    public int maxOperations(int[] nums, int k) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        int count = 0;
//        for (int num : nums) {
//            int c = hashMap.getOrDefault(k - num, 0);
//            if (c > 0) {
//                count++;
//                hashMap.put(k - num, c - 1);
//            } else {
//                hashMap.merge(num, 1, Integer::sum);
//            }
//        }
//        return count;
//    }
//}