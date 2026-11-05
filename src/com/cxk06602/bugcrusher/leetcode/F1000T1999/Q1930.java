package com.cxk06602.bugcrusher.leetcode.F1000T1999;

public class Q1930 {
    static void main() {
//        System.out.println(new Solution().countPalindromicSubsequence("aabca"));;
    }
}
//class Solution {
//    public int countPalindromicSubsequence(String S) {
//        char[] s = S.toCharArray();
//        int n = s.length;
//        int[] suf = new int[26];
//        for (int i = 1; i < n; ++i) {
//            ++suf[s[i] - 'a'];
//        }
//        int count = 0;
//        boolean[] pre = new boolean[26];
//        boolean[][] hashMap = new boolean[26][26];
//        for (int i = 1; i < s.length - 1; ++i) {
//            int mid = s[i] - 'a';
//            --suf[mid];
//            pre[s[i - 1] - 'a'] = true;
//            for (int letter = 0; letter < 26; ++letter) {
//                if(pre[letter] && suf[letter] > 0 && !hashMap[mid][letter]){
//                    hashMap[mid][letter] = true;
//                    ++count;
//                }
//            }
//        }
//        return count;
//    }
//}