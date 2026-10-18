package com.cxk06602.bugcrusher.leetcode;

public class Q3325 {
    static void main() {
//        System.out.println(new Solution().numberOfSubstrings("abacb", 2));//4
    }
}
//class Solution {
//    public int numberOfSubstrings(String S, int k) {
//        int[] hash = new int[26];
//        char[] s = S.toCharArray();
//        int n = s.length;
//        int left = 0, count = 0;
//        for (int i = 0; i < n; i++) {
//            hash[s[i] - 'a']++;
//            while(hash[s[i] - 'a'] >= k){
//                hash[s[left] - 'a']--;
//                left++;
//            }
//            count += left;
//        }
//        return count;
//    }
//}