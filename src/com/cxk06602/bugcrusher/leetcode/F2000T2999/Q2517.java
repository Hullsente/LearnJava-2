package com.cxk06602.bugcrusher.leetcode.F2000T2999;

import java.util.Arrays;

public class Q2517 {
    static void main() {
//        System.out.println(new Solution().maximumTastiness(new int[]{13,5,1,8,21,2}, 3));;
    }
}
//class Solution {
//    public int maximumTastiness(int[] price, int k) {
//        Arrays.sort(price);
//        //1 2 5 8 13 21
//        int left = -1;
//        int right = (price[price.length - 1] - price[0]) / (k - 1) + 1;
//
//        while (left + 1 < right) {
//            int mid = left + (right - left) / 2;
//            if (check(price, k, mid)) {
//                left = mid;
//            } else {
//                right = mid;
//            }
//        }
//        return left;
//    }
//
//    private boolean check(int[] price, int k, int tryAns) {
//        int count = 1;
//        int pre = price[0];
//        for (int p : price) {
//            if (p - pre >= tryAns) {
//                count++;
//                pre = p;
//            }
//        }
//        return count >= k;
//    }
//}