package com.cxk06602.bugcrusher.leetcode.F1T999;

public class Q793 {
    static void main() {

    }
}

//class Solution {
//    public int preimageSizeFZF(int k) {
//        long left = -1L;
//        long right = k * 5L + 1;
//        while(left + 1 < right){
//            long mid = left + (right - left) / 2;
//            long n = 5L, count = 0;
//            while(n <= mid){
//                count += mid / n;
//                n *= 5;
//            }
//
//            if(count == k){
//                return 5;
//            }
//            if(count > k){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return 0;
//    }
//}