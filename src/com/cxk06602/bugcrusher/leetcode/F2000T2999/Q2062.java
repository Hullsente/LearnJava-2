package com.cxk06602.bugcrusher.leetcode;

import java.util.HashMap;

public class Q2062 {
    static void main() {

    }
}

//cuaieuouac
//class Solution {
//    public int countVowelSubstrings(String Word) {
//        char[] word = Word.toCharArray();
//        int n = word.length;
//        int count = 0, left = 0, start = 0;
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            char ch = word[i];
//            if("aeiou".indexOf(ch) < 0){
//                hashMap.clear();
//                start = left = i + 1;
//                continue;
//            }
//
//            hashMap.merge(ch, 1, Integer::sum);
//            while(hashMap.size() == 5){
//                int value = hashMap.merge(word[left], -1, Integer::sum);
//                if(value == 0){
//                    hashMap.remove(word[left]);
//                }
//                left++;
//            }
//            count += left - start;
//        }
//        return count;
//    }
//}