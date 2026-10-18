package com.cxk06602.bugcrusher.leetcode;

public class Q3733 {
    static void main() {

    }
}

//class Solution {
//    public long minimumTime(int[] d, int[] r) {
//        long lcm = lcm(r[0], r[1]);
//        long left = d[0] + d[1] - 1;
//        long right = (long) 2 * (d[0] + d[1]);
//        while(left + 1 < right){
//            long mid = left + right >>> 1;
//            if(check(d, r, lcm, mid)){
//                right = mid;
//            }else {
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] d, int[] r, long lcm, long tryTime) {
//        long noFly = tryTime / lcm;
//
//        long justR1 = tryTime / r[1] - noFly;
//        long justR2 = tryTime / r[0] - noFly;
//
//        long sharingTime = tryTime - tryTime / r[0] - tryTime / r[1] + noFly;
//
//        return  d[0] <= justR1 + sharingTime &&
//                d[1] <= justR2 + sharingTime &&
//                d[0] + d[1] <= justR1 + justR2 + sharingTime;
//    }
//
//    private int gcd(int a, int b) {
//        while (a != 0) {
//            int tmp = a;
//            a = b % a;
//            b = tmp;
//        }
//        return b;
//    }
//
//    private int lcm(int a, int b) {
//        return a / gcd(a, b) * b;
//    }
//}