package com.cxk06602.bugcrusher.leetcode.F1T999;

public class Q498 {
    static void main() {
//        new Solution().findDiagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
//class Solution {
//    public int[] findDiagonalOrder(int[][] mat) {
//        int m = mat.length;
//        int n = mat[0].length;
//        //k = i + j
//        int[] ans = new int[m * n];
//        int index = 0;
//        for (int k = 0; k < m + n - 1; k++) {
//            // j = k - i
//            int minJ = Math.max(k - m + 1, 0);
//            int maxJ = Math.min(k, n - 1);
//            if((k & 1) == 0){
//                for (int j = minJ; j <= maxJ; j++) {
//                    ans[index++] = mat[k - j][j];
//                }
//            }else{
//                for (int j = maxJ; j >= minJ; j--) {
//                    ans[index++] = mat[k - j][j];
//                }
//            }
//        }
//        return ans;
//    }
//}