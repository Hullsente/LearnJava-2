package com.cxk06602.bugcrusher.leetcode.F3000T3999;

public class Q3361 {
    static void main() {
        System.out.println(new Solution().shiftDistance("leet", "code", new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}));
    }
}

class Solution {
    public long shiftDistance(String S, String T, int[] nextCost, int[] previousCost) {
        long[] nextSum = new long[27];
        long[] preSum = new long[27];
        for (int i = 0; i < 26; i++) {
            nextSum[i + 1] = nextSum[i] + nextCost[i];
            preSum[25 - i] = preSum[26 - i] + previousCost[25 - i];
        }
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        long ans = 0;
        for (int i = 0; i < s.length; i++) {
            s[i] -= 'a';
            t[i] -= 'a';
            long nextNeedCost, preNeedCost;
            if(t[i] > s[i]){
                nextNeedCost = nextSum[t[i]] - nextSum[s[i]];
                preNeedCost = preSum[0] - preSum[s[i] + 1] + preSum[t[i] + 1];
            }else{
                nextNeedCost = nextSum[26] - nextSum[s[i]] + nextSum[t[i]];
                preNeedCost = preSum[t[i] + 1] - preSum[s[i] + 1];
            }
            ans += Math.min(nextNeedCost, preNeedCost);
        }
        return ans;
    }
}