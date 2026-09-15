package com.cxk06602.bugcrusher.leetcode;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Q3306 {
    static void main() {
    }
}

//class Solution {
//    public long countOfSubstrings(String Word, int k) {
//        char[] word = Word.toCharArray();
//        int n = word.length;
//        long count = 0, count1 = 0, count2 = 0;
//        int left1 = 0, left2 = 0;
//        Map<Character, Integer> hashMap1 = new HashMap<>();
//        Map<Character, Integer> hashMap2 = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            hashMap1.merge(word[i], 1, Integer::sum);
//            if(!isVowelLetter(word[i]))count1++;
//            while(containAllVowelLetter(hashMap1) && count1 >= k){
//                hashMap1.merge(word[left1], -1, Integer::sum);
//                if(!isVowelLetter(word[left1]))count1--;
//                left1++;
//            }
//            count += left1;
//
//            hashMap2.merge(word[i], 1, Integer::sum);
//            if(!isVowelLetter(word[i]))count2++;
//            while(containAllVowelLetter(hashMap2) && count2 > k){
//                hashMap2.merge(word[left2], -1, Integer::sum);
//                if(!isVowelLetter(word[left2]))count2--;
//                left2++;
//            }
//            count -= left2;
//        }
//        return count;
//    }
//    private boolean containAllVowelLetter(Map<Character, Integer> map){
//        return map.getOrDefault('a', 0) >= 1 &&
//                map.getOrDefault('e', 0) >= 1 &&
//                map.getOrDefault('i', 0) >= 1 &&
//                map.getOrDefault('o', 0) >= 1 &&
//                map.getOrDefault('u', 0) >= 1;
//    }
//    private boolean isVowelLetter(char letter){
//        return letter == 'a' ||
//                letter == 'e' ||
//                letter == 'i' ||
//                letter == 'o' ||
//                letter == 'u';
//    }
//}