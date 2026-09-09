package com.cxk06602.bugcrusher.leetcode;

public class Q3258 {
}
//class Solution {
//    public int countKConstraintSubstrings(String S, int k) {
//        char[] s = S.toCharArray();
//        int n = s.length;
//        int count = 0, left = 0;
//        int[] counts = {0,0};
//        for (int i = 0; i < n; i++) {
//            counts[s[i] - '0']++;
//            while(Math.min(counts[0], counts[1]) > k){
//                counts[s[left] - '0']--;
//                left++;
//            }
//            count += i - left + 1;
//        }
//        return count;
//    }
//}