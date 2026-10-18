package com.cxk06602.bugcrusher.leetcode;

public class Q668 {
    static void main() {

    }
}
//class Solution {
//    public int findKthNumber(int m, int n, int k) {
//        int left = 0;
//        int right = m * n + 1;
//        while(left + 1 < right){
//            int mid = left + right >>> 1;
//            if(check(m, n, k, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int m, int n, int k, int tryNum){
//        int count = 0;
//        for (int i = 1; i <= m; i++) {
//            count += Math.min(tryNum / i, n);
//        }
//        return count >= k;
//    }
//}