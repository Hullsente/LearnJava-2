package com.cxk06602.bugcrusher.leetcode;

import java.util.Collections;
import java.util.List;

public class Q2861 {
    static void main() {
    }
}
//class Solution {
//    public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> Stock, List<Integer> Cost) {
//        int mx = Collections.min(Stock) + budget;
//        Integer[] stock = Stock.toArray(Integer[]::new);
//        Integer[] cost = Cost.toArray(Integer[]::new);
//        int ans = 0;
//        for(List<Integer> list : composition){
//            Integer[] com = list.toArray(Integer[]::new);
//            int left = ans;
//            int right = mx + 1;
//            while(left + 1 < right){
//                int mid = left + right >>> 1;
//                long money = 0;
//                for (int i = 0; i < n && money <= budget; i++) {
//                    if(stock[i] < (long) com[i] * mid){
//                        money += ((long) com[i] * mid - stock[i]) * cost[i];
//                    }
//                }
//                if(money <= budget){
//                    left = mid;
//                }else{
//                    right = mid;
//                }
//            }
//            ans = left;
//        }
//        return ans;
//    }
//}