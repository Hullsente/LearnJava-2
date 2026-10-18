package com.cxk06602.bugcrusher.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Q719 {
    static void main() {
        System.out.println(new Solution().smallestDistancePair(new int[]{2,2,0,1,1,0,0,1,2,0}, 2));
    }
}
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = -1;
        int right = nums[n - 1] - nums[0] + 1;
        while(left + 1 < right){
            int mid = left + right >>> 1;
            if(check(nums, k, mid)){
                right = mid;
            }else{
                left = mid;
            }
        }
        return right;
    }
    private boolean check(int[] nums, int k, int tryLength){
        int n = nums.length;
        int count = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            while(nums[j] - nums[i] > tryLength){
                i++;
            }
            count += j - i;
        }



        return count >= k;
    }
}