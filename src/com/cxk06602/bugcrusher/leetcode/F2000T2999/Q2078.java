package com.cxk06602.bugcrusher.leetcode.F2000T2999;

public class Q2078 {
    static void main() {

    }
}

//class Solution {
//    public int maxDistance(int[] colors) {
//        int n = colors.length;
//        int c = colors[0];
//        if(c != colors[n - 1]){
//            return n - 1;
//        }
//        int left = 1;
//        int right = n - 2;
//        while(colors[right] == c){
//            right--;
//        }
//        while(colors[left] == c){
//            left++;
//        }
//        return Math.max(right, n - left - 1);
//
//    }
//}