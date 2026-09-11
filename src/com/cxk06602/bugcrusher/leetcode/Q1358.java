package com.cxk06602.bugcrusher.leetcode;

public class Q1358 {
    static void main() {

    }
}
class Solution {
    public int numberOfSubstrings(String S) {
        char[] s = S.toCharArray();
        int[] counts = new int[3];
        int count = 0, left = 0;
        for(char c : s){
            counts[c - 'a']++;
            while(counts[0] > 0 && counts[1] > 0 && counts[2] > 0){
                counts[s[left] - 'a']--;
                left++;
            }
            count += left;
        }
        return count;
    }
}
