package com.cxk06602.bugcrusher.leetcode.F3000T3999;

import java.util.HashMap;

public class Q3583 {

}
//class Solution {
//    public int specialTriplets(int[] nums) {
//        long count = 0;
//        HashMap<Integer, Integer> afterHashMap = new HashMap<>();
//        for (int num : nums) {
//            afterHashMap.merge(num, 1, Integer::sum);
//        }
//        HashMap<Integer, Integer> presenteHashMap = new HashMap<>();
//        for (int num : nums) {
//            afterHashMap.merge(num, -1, Integer::sum);
//
//            count += (long) presenteHashMap.getOrDefault(num * 2, 0) * afterHashMap.getOrDefault(num * 2, 0);
//            presenteHashMap.merge(num, 1, Integer::sum);
//        }
//        return (int) (count % (1e9 + 7));
//    }
//}