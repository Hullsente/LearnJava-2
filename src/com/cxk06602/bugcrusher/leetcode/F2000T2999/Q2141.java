package com.cxk06602.bugcrusher.leetcode;

public class Q2141 {
    static void main() {

    }
}

//class Solution {
//    public long maxRunTime(int n, int[] batteries) {
//        long left = -1;
//        long right = 0;
//        for (int battery : batteries) {
//            right += battery;
//        }
//        right = right / n + 1;
//        while(left + 1 < right){
//            long mid = left + right >>> 1;
//            long sum = 0;
//            for(int battery : batteries){
//                sum += Math.min(battery, mid);
//            }
//            if(n * mid <= sum){
//                left = mid;
//            }else{
//                right = mid;
//            }
//        }
//        return left;
//    }
//}