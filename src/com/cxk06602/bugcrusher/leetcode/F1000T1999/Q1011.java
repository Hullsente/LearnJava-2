package com.cxk06602.bugcrusher.leetcode;

public class Q1011 {
    static void main() {

    }
}

//class Solution {
//    public int shipWithinDays(int[] weights, int days) {
//        int right = 0;
//        int left = 500;
//        for(int w : weights){
//            right += w;
//            left = Math.min(left, w);
//        }
//        left--;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(check(weights, mid, days)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] weight, int canWeight, int days){
//        int sum = 0;
//        int day = 0;
//        for (int i = 0; i < weight.length; i++) {
//            sum += weight[i];
//            if(day >= days){
//                return false;
//            }
//            if(sum > canWeight){
//                day++;
//                sum = 0;
//                i--;
//            }
//        }
//        return true;
//    }
//}