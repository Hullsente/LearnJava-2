package com.cxk06602.bugcrusher.leetcode;

public class Q3007 {
    static void main() {
//        System.out.println(new Solution().findMaximumNumber(7,2));
    }
}

//class Solution {
//    public long findMaximumNumber(long k, int x) {
//        int originalX = --x;
//        long left = -1;
//        long right = k + x + 1;
//        while(left + 1 < right){
//            long mid = left + right >>> 1;
//            long allPrice = 0;
//            for (long i = 1; i <= mid; i++) {
//                long j = i;
//                do {
//                    allPrice += (j = j >>> x) & 1;
//                    if(x == 0)x = 1;
//                }while(j != 0);
//                if(originalX == 0)x = originalX;
//            }
//            if(allPrice <= k){
//                left = mid;
//            }else{
//                right = mid;
//            }
//        }
//        return left;
//    }
//}