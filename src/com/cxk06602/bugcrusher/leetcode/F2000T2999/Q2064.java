package com.cxk06602.bugcrusher.leetcode;

public class Q2064 {
    static void main() {
//        System.out.println(new Solution().minimizedMaximum(100000, new int[]{2}));
    }
}

//class Solution {
//    public int minimizedMaximum(int n, int[] quantities) {
//        int mx = 0;
//        for (int q : quantities) {
//            mx = Math.max(mx, q);
//        }
//
//        int left = 0;
//        int right = mx;
//
//        while(left + 1 < right){
//            int mid = left + right >>> 1;
//            if(check(n, quantities, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int n, int[] quantities, int maxNum){
//        int cnt = 0;
//        for (int quantity : quantities) {
//            cnt += (quantity + maxNum - 1) / maxNum;
//        }
//        return cnt <= n;
//    }
//}