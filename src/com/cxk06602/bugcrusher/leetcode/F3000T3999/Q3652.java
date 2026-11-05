package com.cxk06602.bugcrusher.leetcode.F3000T3999;

public class Q3652 {
    static void main() {

    }
}

//class Solution {
//    public long maxProfit(int[] prices, int[] strategy, int k) {
//        int n = prices.length;
//        long[] sum = new long[n + 1];
//        long[] sumSell = new long[n + 1];
//        for (int i = 0; i < n; i++) {
//            sum[i + 1] = sum[i] + prices[i] * strategy[i];
//            sumSell[i + 1] = sumSell[i] + prices[i];
//        }
//        long ans = sum[n];
//        for(int i = k; i <= n; i++){
//            ans = Math.max(ans, sum[i - k] + sum[n] - sum[i] + sumSell[i] - sumSell[i - k / 2]);
//        }
//        return ans;
//    }
//}