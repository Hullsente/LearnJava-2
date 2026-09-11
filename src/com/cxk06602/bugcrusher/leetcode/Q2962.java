package com.cxk06602.bugcrusher.leetcode;

public class Q2962 {
    static void main() {
        //594
//        System.out.println(new Solution().countSubarrays(new int[]{37,20,38,66,34,38,9,41,1,14,25,63,8,12,66,66,60,12,35,27,16,38,12,66,38,36,59,54,66,54,66,48,59,66,34,11,50,66,42,51,53,66,31,24,66,44,66,1,66,66,29,54}, 5));
    }
}

//class Solution {
//    public long countSubarrays(int[] nums, int k) {
//        int max = 1;
//        for(int n : nums){
//            if(n > max)max = n;
//        }
//        int n = nums.length;
//        long count = 0;
//        int maxCount = 0;
//        int left = 0;
//        for (int i = 0; i < n; i++) {
//            if(nums[i] == max)maxCount++;
//            while(maxCount >= k){
//                if(nums[left] == max)maxCount--;
//                left++;
//            }
//            count += left;
//        }
//        return count;
//    }
//}