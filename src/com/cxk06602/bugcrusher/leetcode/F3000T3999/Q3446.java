package com.cxk06602.bugcrusher.leetcode.F3000T3999;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q3446 {
    static void main() {

    }
}

//class Solution {
//    public int[][] sortMatrix(int[][] grid) {
//        int m = grid.length;
//        int n = grid[0].length;
//        // k = i - j + n
//        for(int k = 1; k < m + n; k++){
//            //j = i - k + n
//            int minJ = Math.max(n - k, 0);
//            int maxJ = Math.min(m - 1 - k + n , n - 1);
//            //i = j + k - n
//            List<Integer> a = new ArrayList<>(maxJ - minJ + 1);
//            for (int j = minJ; j <= maxJ; j++) {
//                a.add(grid[k + j - n][j]); // 根据 k 的定义得 i=k+j-n
//            }
//            a.sort(minJ > 0 ? null : Comparator.reverseOrder());
//            for(int j = minJ; j <= maxJ; j++){
//                grid[j + k - n][j] = a.get(j - minJ);
//            }
//        }
//        return grid;
//    }
//}