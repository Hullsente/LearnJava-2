package com.cxk06602.bugcrusher.leetcode;

public class Q1760 {
    static void main() {

    }
}

class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 0;
        int right = 0;
        for(int num : nums){
            right = Math.max(right, num);
        }
        right++;

        while(left + 1 < right){
            int mid = left + right >>> 1;
            if(check(nums, maxOperations, mid)){
                right = mid;
            }else{
                left = mid;
            }
        }
        return right;

    }
    private boolean check(int[] nums, int maxOperations, int cap){
        long needOperations = 0;
        for (int num : nums){
            needOperations += (num - 1) / cap;
        }
        return needOperations <= maxOperations;
    }
}