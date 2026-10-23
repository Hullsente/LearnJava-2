package com.cxk06602.bugcrusher.leetcode.F1000T1999;

import java.util.List;

public class Q624 {
    static void main() {

    }
}
//class Solution {
//    public int maxDistance(List<List<Integer>> arrays) {
//        int ans = 0;
//        int max = Integer.MIN_VALUE / 2;
//        int min = Integer.MAX_VALUE / 2;
//        for (List<Integer> array : arrays) {
//            int arrMin = array.getFirst();
//            int arrMax = array.getLast();
//
//            ans = Math.max(ans, Math.max(max - arrMin, arrMax - min));
//
//            max = Math.max(max, arrMax);
//            min = Math.min(min, arrMin);
//        }
//        return ans;
//    }
//}