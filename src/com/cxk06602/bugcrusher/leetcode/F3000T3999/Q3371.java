package com.cxk06602.bugcrusher.leetcode.F3000T3999;

import java.util.HashMap;

public class Q3371 {
    static void main() {
//        new Solution().getLargestOutlier(new int[]{874,159,-838,-375,658});
    }
}
//class Solution {
//    public int getLargestOutlier(int[] nums) {
//        int sum = 0;
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int num : nums) {
//            hashMap.merge(num, 1, Integer::sum);
//            sum += num;
//        }
//
//        int max = Integer.MIN_VALUE;
//        for (int num : nums) {
//            if (((sum - num) % 2) == 0) {
//                int y = (sum - num) / 2;
//                if (hashMap.containsKey(y) && (num != y || hashMap.get(y) > 1)) {
//                    max = Math.max(max, num);
//                }
//            }
//        }
//        return max;
//    }
//}