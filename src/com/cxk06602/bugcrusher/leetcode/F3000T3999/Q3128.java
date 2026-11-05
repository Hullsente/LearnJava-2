package com.cxk06602.bugcrusher.leetcode.F3000T3999;

import java.util.Arrays;

public class Q3128 {
    static void main() {
//        System.out.println(new Solution().numberOfRightTriangles(new int[][]{{0,1,0},{0,1,1},{0,1,0}}));
    }
}

//class Solution {
//    public long numberOfRightTriangles(int[][] grid) {
//        int n = grid[0].length;
//        int[] colSum = new int[n];
//        Arrays.fill(colSum, -1);
//        for (int[] row : grid) {
//            for (int j = 0; j < n; j++) {
//                colSum[j] += row[j];
//            }
//        }
//
//        long count = 0;
//        for(int[] row : grid){
//            int rowSum = -1;
//            for(int j : row){
//                rowSum += j;
//            }
//            for(int j = 0; j < n; j++){
//                if(row[j] == 1) count += (long) rowSum * colSum[j];
//            }
//        }
//
//
//        return count;
//    }
//}