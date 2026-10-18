package com.cxk06602.bugcrusher.leetcode;

import java.util.HashMap;

public class Q2799 {
    static void main() {
        //21
//        System.out.println(new Solution().countGood(new int[]{2,1,3,1,2,2,3,3,2,2,1,1,1,3,1}, 11));
    }
}

//class Solution {
//    public long countGood(int[] nums, int k) {
//        long count = 0;
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        int n = nums.length;
//        int equalCount = 0, left = 0;
//        for (int i = 0; i < n; i++) {
//            hashMap.merge(nums[i], 1, Integer::sum);
//            equalCount += hashMap.get(nums[i]) - 1;
//            while(equalCount >= k && left < n){
//                count += n - i;
//                equalCount -= hashMap.get(nums[left]) - 1;
//                hashMap.merge(nums[left], -1, Integer::sum);
//                left++;
//            }
//        }
//        return count;
//    }
//}