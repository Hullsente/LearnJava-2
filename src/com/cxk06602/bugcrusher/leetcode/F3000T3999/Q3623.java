package com.cxk06602.bugcrusher.leetcode.F3000T3999;

import java.util.HashMap;

public class Q3623 {
    static void main() {

    }
}
//class Solution {
//    public int countTrapezoids(int[][] points) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//
//        for (int[] point : points) {
//            hashMap.merge(point[1], 1, Integer::sum);
//        }
//
//        long count = 0, sum = 0;
//        for (int value : hashMap.values()) {
//            long lineCount = (long) value * (value - 1) / 2;
//            count += sum * lineCount;
//            sum += lineCount;
//        }
//        return (int)(count % (1000000000 + 7));
//    }
//}