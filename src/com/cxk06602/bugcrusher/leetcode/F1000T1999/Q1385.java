package com.cxk06602.bugcrusher.leetcode;

import java.util.Arrays;

public class Q1385 {
    static void main() {
        //-5 -3 -2 7 10
        //
//        System.out.println(new Solution().findTheDistanceValue(new int[]{2,1,100,3}, new int[]{-5,-2,10,-3,7}, 6));
    }
}
//class Solution {
//    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
//        Arrays.sort(arr2);
//        int ans = 0;
//        for (int x : arr1) {
//            int i = Arrays.binarySearch(arr2, x - d);
//            if (i < 0) {
//                i = ~i; // -i - 1
//            }
//            if (i == arr2.length || arr2[i] > x + d) {
//                ans++;
//            }
//        }
//        return ans;
//    }
//}