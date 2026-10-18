package com.cxk06602.bugcrusher.leetcode;

import java.util.HashMap;

public class Q992 {
    static void main() {

    }
}

//class Solution {
//    public int subarraysWithKDistinct(int[] nums, int k) {
//        int n = nums.length;
//        int count = 0;
//        int left1 = 0, left2 = 0;
//        int count1 = 0, count2 = 0;
//        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
//        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            int num = hashMap1.merge(nums[i], 1, Integer::sum);
//            if(num == 1)count1++;
//            while(count1 >= k){
//                num = hashMap1.merge(nums[left1], -1, Integer::sum);
//                if(num == 0){
//                    count1--;
//                    hashMap1.remove(nums[left1]);
//                };
//                left1++;
//            }
//            count += left1;
//
//            num = hashMap2.merge(nums[i], 1, Integer::sum);
//            if(num == 1)count2++;
//            while(count2 > k){
//                num = hashMap2.merge(nums[left2], -1, Integer::sum);
//                if(num == 0){
//                    count2--;
//                    hashMap2.remove(nums[left2]);
//                };
//                left2++;
//            }
//            count -= left2;
//        }
//        return count;
//    }
//}