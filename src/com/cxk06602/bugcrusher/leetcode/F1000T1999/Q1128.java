package com.cxk06602.bugcrusher.leetcode.F1000T1999;

public class Q1128 {
    static void main() {

    }
}

//class Solution {
//    public int numEquivDominoPairs(int[][] dominoes) {
//        int[] hashMap = new int[100];
//        int count = 0;
//        for (int[] dominoe : dominoes) {
//            int min = Math.min(dominoe[0], dominoe[1]);
//            int max = Math.max(dominoe[0], dominoe[1]);
//
//            count += hashMap[min * 10 + max];
//            hashMap[min * 10 + max]++;
//        }
//        return count;
//    }
//}