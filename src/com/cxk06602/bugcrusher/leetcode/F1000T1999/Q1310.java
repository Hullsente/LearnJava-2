package com.cxk06602.bugcrusher.leetcode.F1000T1999;

public class Q1310 {
    static void main() {

    }
}
//class Solution {
//    public int[] xorQueries(int[] arr, int[][] queries) {
//        int[] xor = new int[arr.length + 1];
//        int[] ans = new int[queries.length];
//        for (int i = 0; i < arr.length; i++) {
//            xor[i + 1] = arr[i] ^ xor[i];
//        }
//        for (int i = 0; i < queries.length; i++) {
//            int[] query = queries[i];
//            ans[i] = xor[query[1] + 1] ^ xor[query[0]];
//        }
//        return ans;
//    }
//}