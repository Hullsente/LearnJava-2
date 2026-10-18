package com.cxk06602.bugcrusher.leetcode;

public class Q3296 {
    static void main() {
//        System.out.println(new Solution().minNumberOfSeconds(4, new int[]{2,1,1}));
    }
}

//class Solution {
//    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
//        int left = 0;
//        int right = Integer.MIN_VALUE;
//        for (int workerTime : workerTimes){
//            right = Math.max(workerTime, right);
//        }
//        right++;
//
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(check(workerTimes, mid, mountainHeight)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] workerTimes, int wantSec, int mountainHeight){
//        int canRemoveHeight = 0;
//        for (int workerTime : workerTimes) {
//            canRemoveHeight +=  ((int) Math.sqrt(1.0 * wantSec / workerTime * 8 + 1) - 1) / 2;
//            if (canRemoveHeight >= mountainHeight) {
//                return true;
//            }
//        }
//        return false;
//    }
//}