package com.cxk06602.bugcrusher.leetcode.F2000T2999;

import java.util.HashMap;

public class Q2260 {
    static void main() {

    }
}

//class Solution {
//    public int minimumCardPickup(int[] cards) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < cards.length; i++) {
//            if(hashMap.containsKey(cards[i])){
//                min = Math.min(min, i - hashMap.get(cards[i]) + 1);
//            }
//            hashMap.put(cards[i], i);
//        }
//        return min == Integer.MAX_VALUE ? -1 : min;
//    }
//}