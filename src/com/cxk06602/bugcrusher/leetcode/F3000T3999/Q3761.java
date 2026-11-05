package com.cxk06602.bugcrusher.leetcode.F3000T3999;


import java.util.HashMap;

public class Q3761 {
    static void main() {
//        new Solution().minMirrorPairDistance(new int[]{12,21,45,33,54});
    }
}

//class Solution {
//    public int minMirrorPairDistance(int[] nums) {
//        int min = Integer.MAX_VALUE;
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int reverse = reverse(nums[i]);
//            if(hashMap.containsKey(nums[i])){
//                min = Math.min(min, i - hashMap.get(nums[i]));
//            }
//            hashMap.put(reverse, i);
//        }
//        return min == Integer.MAX_VALUE ? -1 : min;
//    }
//    private int reverse(int num){
//        int sum = 0;
//        while(num > 0){
//            sum = sum * 10 + num % 10;
//            num /= 10;
//        }
//        return sum;
//    }
//}