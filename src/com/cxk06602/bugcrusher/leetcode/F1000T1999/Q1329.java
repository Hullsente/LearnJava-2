package com.cxk06602.bugcrusher.leetcode.F1000T1999;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Q1329 {
    static void main() {
//        new Solution().diagonalSort(new int[][]{{3,3,1,1},{2,2,1,2},{1,1,1,2}});
    }
}

//class Solution {
//    public int[][] diagonalSort(int[][] mat) {
//        int m = mat.length;
//        int n = mat[0].length;
//        //k = i - j + n
//        for (int k = 1; k < m + n; k++) {
//            //j = i - k + n
//            int minJ = Math.max(n - k, 0);
//            int maxJ = Math.min(m - 1 - k + n, n - 1);
//
//            ArrayList<Integer> a = new ArrayList<>();
//            for (int j = minJ; j <= maxJ; j++) {
//                //i = k + j - n
//                a.add(mat[k + j - n][j]);
//            }
//            a.sort(null);
//            for (int j = minJ; j <= maxJ; j++) {
//                //i = k + j - n
//                mat[k + j - n][j] = a.get(j - minJ);
//            }
//        }
//        return mat;
//    }
//}