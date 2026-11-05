package com.cxk06602.bugcrusher.leetcode.F2000T2999;

import java.util.*;

public class Q2506 {
    static void main() {

    }
}

//class Solution {
//    public int similarPairs(String[] words) {
//        int ansCount = 0;
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (String word : words) {
//            int hashSet = 0;
//            for (char c : word.toCharArray()) {
//                hashSet |= 1 << (c - 'a');
//            }
//            int count = hashMap.getOrDefault(hashSet, 0);
//            ansCount += count;
//            hashMap.put(hashSet, count + 1);
//        }
//        return ansCount;
//    }
//}