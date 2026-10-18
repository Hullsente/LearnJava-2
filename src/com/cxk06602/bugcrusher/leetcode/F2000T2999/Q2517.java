package com.cxk06602.bugcrusher.leetcode;

import java.util.Arrays;

public class Q2517 {
    static void main() {

    }
}
//class Solution {
//    public int maximumTastiness(int[] price, int k) {
//        Arrays.sort(price);
//        //1 2 5 8 13 21
//        int left = -1;
//        int right = price[price.length - 1] - price[0];
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
//        int minCandy = price[0];
//        for (int j : price) {
//            if (j - minCandy >= tryAns) {
//                count++;
//                minCandy = j;
//            }
//        }
//        return count >= k;
//    }
//}