package com.cxk06602.bugcrusher.leetcode.F3000T3999;

import java.util.ArrayList;
import java.util.HashMap;

public class Q3805 {
    static void main() {
//        System.out.println(new Solution().countPairs(new String[]{"mo","vi","cl","fs","nz","di","hm","tf","ik"}));
    }
}

//class Solution {
//    public long countPairs(String[] words) {
//        long count = 0;
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < words.length; i++) {
//            char[] ca = words[i].toCharArray();
//            char firstChar = ca[0];
//            for (int i1 = 0; i1 < ca.length; i1++) {
//                ca[i1] = (char) ((ca[i1] - firstChar + 26) % 26);
//            }
//            words[i] = new String(ca);
//            int orDefault = hashMap.getOrDefault(words[i], 0);
//            count += orDefault;
//            hashMap.put(words[i], orDefault + 1);
//        }
//        return count;
//    }
//}