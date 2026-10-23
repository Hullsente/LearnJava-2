package com.cxk06602.bugcrusher.leetcode.interview.list16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q24 {
    static void main() {
        new Solution().pairSums(new int[]{5,6,5,6}, 11);
    }
}
class Solution {
    public List<List<Integer>> pairSums(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.getOrDefault(target - num, 0) > 0) {
                ans.add(Arrays.asList(target - num, num));
                hashMap.put(target - num, hashMap.get(target - num) - 1);
            } else {
                hashMap.merge(num, 1, Integer::sum);
            }
        }
        return ans;
    }
}