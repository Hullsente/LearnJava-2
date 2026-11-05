package com.cxk06602.bugcrusher.leetcode.F2000T2999;

public class Q2559 {
    static void main() {
        new Solution().vowelStrings(new String[]{"aba","bcb","ece","aa","e"}, new int[][]{{0,2},{1,4},{1,1}});
    }
}
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length, letter = 1065233, index;
        int[] ans = new int[queries.length], sum = new int[n + 1];
        for(index = 0; index < n; ++index){
            char[] ch = words[index].toCharArray();
            sum[index + 1] = sum[index] + (((letter >> ch[0] - 'a') & 1) &
                    ((letter >> ch[words[index].length() - 1] - 'a') & 1));
        }
        for (index = 0; index < queries.length; ++index)
            ans[index] = sum[queries[index][1] + 1] - sum[queries[index][0]];
        return ans;
    }
}