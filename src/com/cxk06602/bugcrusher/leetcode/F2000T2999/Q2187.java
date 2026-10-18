package com.cxk06602.bugcrusher.leetcode;

public class Q2187 {
    static void main() {
        //1,1,3
        //3

        //1,1,1000
        // 10000



    }
}

//class Solution {
//    public long minimumTime(int[] time, int totalTrips) {
//        //开区间写法
//        int minT = Integer.MAX_VALUE;
//        for (int x : time){
//            minT = Math.min(x, minT);
//        }
//        long left = minT - 1;
//        long right = (long)minT * totalTrips;
//        right *= totalTrips;
//        if(time.length == 1)right++;
//
//        while(left + 1 < right){
//            long mid = left + (right - left) / 2;
//            if(check(time, mid, totalTrips)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] times, long time, int totalTrips){
//        long count = 0;
//        for (int j : times) {
//            count += time / j;
//            if (count >= totalTrips) {
//                return true;
//            }
//        }
//        return false;
//    }
//}