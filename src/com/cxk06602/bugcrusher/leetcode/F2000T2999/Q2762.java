package com.cxk06602.bugcrusher.leetcode;

import java.util.HashMap;
import java.util.TreeMap;

public class Q2762 {
    static void main() {

    }
}
//class Solution {
//    public long continuousSubarrays(int[] nums) {
//        int n = nums.length;
//        long count = 0;
//        int left = 0;
//        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
//        for (int i = 0; i < n; i++) {
//            treeMap.merge(nums[i], 1, Integer::sum);
//            while(treeMap.lastKey() - treeMap.firstKey() > 2){
//                int c = treeMap.get(nums[left]);
//                if(c == 1){
//                    treeMap.remove(nums[left]);
//                }else{
//                    treeMap.put(nums[left], c - 1);
//                }
//                left++;
//            }
//            count += i - left + 1;
//        }
//        return count;
//    }
//}