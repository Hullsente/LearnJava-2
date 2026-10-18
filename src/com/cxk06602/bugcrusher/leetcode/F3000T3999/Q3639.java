package com.cxk06602.bugcrusher.leetcode;

public class Q3639 {
    static void main() {

    }
}

//class Solution {
//    public int minTime(String s, int[] order, int k) {
//        int n = s.length();
//
//        if((long) n * (n + 1) / 2 < k){
//            return -1;
//        }
//        int[] star = new int[n];
//        int left = -1;
//        int right = n - 1;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(check(order, mid, k, star)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] order, int mid, int k, int[] star){
//        mid++;
//        int count = 0;
//        for (int i = 0; i < mid; i++) {
//            star[order[i]] = mid;
//        }
//        int lastStar = -1;
//        for (int i = 0; i < star.length; i++) {
//            if(star[i] == mid){
//                lastStar = i;;
//            }
//            count += lastStar + 1;
//            if(count >= k){
//                return true;
//            }
//        }
//        return false;
//    }
//}