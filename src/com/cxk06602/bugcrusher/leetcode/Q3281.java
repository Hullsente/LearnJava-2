package com.cxk06602.bugcrusher.leetcode;

import java.util.Arrays;

public class Q3281 {
    static void main() {

    }
}


class Solution {
    public int maxPossibleScore(int[] start, int d) {
        Arrays.sort(start);
        int left = -1;
        int right = (start[start.length - 1] + d - start[0]) / (start.length - 1) + 1;
        while(left + 1 < right){
            int mid = left + right >>> 1;
            if(check(start, d, mid)){
                left = mid;
            }else{
                right = mid;
            }
        }
        return left;
    }
    private boolean check(int[] start, int d, int tryScore){
        long x = Long.MIN_VALUE;
        for (int s : start) {
            x = Math.max(x + tryScore, s); // x 必须 >= 区间左端点 s
            if (x > s + d) {
                return false;
            }
        }
        return true;
    }
}