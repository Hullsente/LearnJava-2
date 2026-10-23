package com.cxk06602.bugcrusher.leetcode.F1000T1999;

import java.util.Arrays;

public class Q1552 {
    static void main() {

    }
}

//class Solution {
//    public int maxDistance(int[] position, int m) {
//        Arrays.sort(position);
//        int left = 0;
//        int right = (position[position.length - 1] - position[0]) / (m - 1) + 1;
//        while(left + 1 < right){
//            int mid = left + right >>> 1;
//            if(check(position, m, mid)){
//                left = mid;
//            }else{
//                right = mid;
//            }
//        }
//        return left;
//    }
//    private boolean check(int[] positions, int m, int tryForce){
//        int count = 1;
//        int pre = positions[0];
//        for (int position : positions) {
//            if(position - pre >= tryForce){
//                count++;
//                pre = position;
//            }
//        }
//
//        return  count >= m;
//    }
//}