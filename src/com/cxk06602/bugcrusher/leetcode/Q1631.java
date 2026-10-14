package com.cxk06602.bugcrusher.leetcode;

public class Q1631 {
    static void main() {

    }
}

//class Solution {
//    public int minimumEffortPath(int[][] heights) {
//        int left = -1;
//        int min = 1000000;
//        int max = 1;
//        int right = 0;
//        for(int[] Height : heights){
//            for(int height : Height){
//                min = Math.min(min, height);
//                max = Math.max(max, height);
//            }
//        }
//        right = max - min + 1;
//        while(left + 1 < right){
//            int mid = left + right >>> 1;
//            if(check(heights, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[][] heights, int maxPower){
//        return move(heights, maxPower, 0)
//    }
//    private boolean move(int[][] heights, int maxPower, int move){
//
//    }
//}