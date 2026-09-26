package com.cxk06602.bugcrusher.leetcode;

public class Q875 {
    static void main() {
//        System.out.println(new Solution().minEatingSpeed(new int[]{312884470}, 968709470));;
    }
}
//class Solution {
//    public int minEatingSpeed(int[] piles, int h) {
//        int left = 0;
//        int right = 0;
//        for (int x : piles){
//            right = Math.max(right, x);
//        }
//        right++;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(check(piles, mid, h)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] piles, int wantHour, int h){
//        int sumHour = 0;
//        for (int pile : piles){
//            sumHour += (pile + wantHour - 1) / wantHour;
//            if(sumHour > h){
//                return false;
//            }
//        }
//        return true;
//    }
//}