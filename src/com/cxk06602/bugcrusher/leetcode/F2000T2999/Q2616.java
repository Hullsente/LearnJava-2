package com.cxk06602.bugcrusher.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q2616 {
    static void main() {
//        System.out.println(new Solution().minimizeMax(new int[]{3,4,2,3,2,1,2}, 3));
    }
}

//class Solution {
//    public int minimizeMax(int[] nums, int p) {
//        Arrays.sort(nums);
//        int left = -1;
//        int right = nums[nums.length - 1] - nums[0] + 1;
//        while(left + 1 < right){
//            int mid = left + right >>> 1;
//            if(check(nums, p, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] nums, int p, int limitDiffer){
//        int count = 0;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] - nums[i - 1] <= limitDiffer) {
//                count++;
//                i++;
//            }
//        }
//        return count >= p;
//    }
//}