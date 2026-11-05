package com.cxk06602.bugcrusher.leetcode.F1000T1999;

public class Q1010 {
    static void main() {

    }
}
//class Solution {
//    public int numPairsDivisibleBy60(int[] time) {
//        int count = 0;
//        int[] hashMap = new int[60];
//        for (int j : time) {
//            count += hashMap[(60 - j % 60) % 60];
//            hashMap[j % 60]++;
//        }
//        return count;
//    }
//}