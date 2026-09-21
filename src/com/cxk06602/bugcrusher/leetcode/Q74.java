package com.cxk06602.bugcrusher.leetcode;

public class Q74 {
    static void main() {
//        System.out.println(new Solution().searchMatrix(new int[][]{{1}}, 0));
//        System.out.println(new Solution().searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3));
//        System.out.println(new Solution().searchMatrix(new int[][]{{1}}, 0));
    }
}

//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int left = -1;
//        int right = matrix.length;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(matrix[mid][matrix[0].length - 1] >= target){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        int existIndex = right == matrix.length ? right - 1 : right;
//        left = -1;
//        right = matrix[0].length;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(matrix[existIndex][mid] >= target){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        if(right == matrix[existIndex].length)return false;
//        return matrix[existIndex][right] == target;
//    }
//}