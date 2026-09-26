package com.cxk06602.bugcrusher.leetcode;

public class Q1482 {
    static void main() {
//        System.out.println(new Solution().minDays(new int[]{1,10,2,9,3,8,4,7,5,6}, 4, 2));;
    }
}
//class Solution {
//    public int minDays(int[] bloomDay, int m, int k) {
//        int left = (int) 1e9 + 1;
//        int right = 0;
//        for (int bloom : bloomDay) {
//            left = Math.min(left, bloom);
//            right = Math.max(right, bloom);
//        }
//        right++;
//        left--;
//        int nullNum = right;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(check(bloomDay, mid, m, k)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        if(nullNum == right)return -1;
//        return right;
//    }
//    private boolean check(int[] bloomDay, int wantDay, int m, int k){
//        int count = 0;
//        for (int i = 0, j; i < bloomDay.length;) {
//            j = i;
//            while(j - i < k && j < bloomDay.length && bloomDay[j] <= wantDay){
//                j++;
//            }
//            if(j - i == k){
//                count++;
//            }
//            i = j;
//            if(j < bloomDay.length && bloomDay[j] > wantDay)i++;
//        }
//        return count >= m;
//    }
//}