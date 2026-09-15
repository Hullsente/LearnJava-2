package com.cxk06602.bugcrusher.leetcode;

import java.util.*;

public class Q3859 {
    static void main() {

    }
}

//class Solution {
//    public long countSubarrays(int[] nums, int k, int m) {
//        return method(nums, k, k, m) - method(nums, k + 1, k, m);
//    }
//    private long method(int[] nums, int dis, int k, int m){
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        long goodNumberCount = 0;
//        long count = 0;
//        int left = 0;
//        for (int num : nums) {
//            int n = hashMap.merge(num, 1, Integer::sum);
//            if(n == m){
//                goodNumberCount++;
//            }
//            while(hashMap.size() >= dis && goodNumberCount >= k){
//                int c = hashMap.get(nums[left]);
//                if (c == m) {
//                    goodNumberCount--;
//                }
//                if (c == 1) {
//                    hashMap.remove(nums[left]);
//                } else {
//                    hashMap.put(nums[left], c - 1);
//                }
//                left++;
//            }
//            count += left;
//        }
//        return count;
//    }
//}