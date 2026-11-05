package com.cxk06602.bugcrusher.leetcode.F2000T2999;

import java.util.HashMap;
import java.util.HashSet;

public class Q2711 {
}
//class Solution {
//    public int[][] differenceOfDistinctValues(int[][] grid) {
//        int m = grid.length;
//        int n = grid[0].length;
//        int[][] ans = new int[m][n];
//        //小技巧，一个HashSet贯彻全部，因为没有value导致出现的数量问题可以
//        HashMap<Integer, Integer> suf = new HashMap<>();
//        //k = i - j + n
//        for (int k = 1; k < m * n; k++) {
//            int minJ = Math.max(n - k,0);
//            int maxJ = Math.min(m - 1 - k + n, n - 1);
//            suf.clear();
//            for (int j = minJ; j <= maxJ; j++) {
//                //i = k + j - n
//                suf.merge(grid[k + j - n][j], 1, Integer::sum);
//            }
//            HashMap<Integer, Integer> pre = new HashMap<>();
//            for (int j = minJ; j <= maxJ; j++) {
//                int key = grid[k + j - n][j];
//                suf.merge(key, -1, Integer::sum);
//                if(k + j - n - 1 >= 0 && j - 1 >= 0)pre.merge(grid[k + j - n - 1][j - 1], 1, Integer::sum);
//                if(suf.get(key) <= 0)suf.remove(key);
//                ans[k + j - n][j] = Math.abs(pre.size() - suf.size());
//            }
//        }
//        return ans;
//    }
//}