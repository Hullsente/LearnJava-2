package com.cxk06602.bugcrusher.leetcode;

public class Q378 {
    static void main() {
//        System.out.println(new Solution().kthSmallest(new int[][]{{1, 2}, {3, 3}}, 4));
    }
}

//class Solution {
//    public int kthSmallest(int[][] matrix, int k) {
//        int n = matrix.length;
//        int left = matrix[0][0] - 1;
//        int right = matrix[n - 1][n - 1] + 1;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(check(matrix, k, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[][] matrix, int k, int tryNum){
//        int count = 0;
//        int n = matrix.length;
//        //行
//        int i = 0;
//        //列
//        int j = n - 1;
//        while(i < n && j >= 0 && count < k){
//            if(tryNum >= matrix[i][j]){
//                count += j + 1;
//                i++;
//            }else{
//                j--;
//            }
//        }
//
//        return count >= k;
//    }
//}