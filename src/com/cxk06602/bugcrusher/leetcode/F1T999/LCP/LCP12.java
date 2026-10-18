package com.cxk06602.bugcrusher.leetcode;

public class LCP12 {
    static void main() {
//        System.out.println(new Solution().minTime(new int[]{1,2,3,3}, 2));
    }
}
//class Solution {
//    public int minTime(int[] time, int m) {
//        int left = -1;
//        int right = 0;
//        for (int num : time) {
//            right += num;
//        }
//        right++;
//        while(left + 1 < right){
//            int mid = left + right >>> 1;
//            if(check(time, m, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] times, int m, int maxTime){
//        int max = 0;
//        int count = 1;
//        int sumTime = 0;
//        for (int time : times) {
//            max = Math.max(max, time);
//            sumTime += time;
//            if (sumTime - max > maxTime) {
//                count++;
//                sumTime = time;
//                max = time;
//            }
//        }
//
//        return count <= m;
//    }
//}
