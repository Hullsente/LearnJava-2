package com.cxk06602.bugcrusher.leetcode.F1T999;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q373 {
    static void main() {

    }
}
//class Solution {
//    List<List<Integer>> list= new ArrayList<>();
//    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//        int n = nums1.length;
//        int left = nums1[0] + nums2[0] - 1;
//        int right = nums1[n - 1] + nums2[n - 1] + 1;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(check(nums1, nums2, k, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//
//        list.sort((list1, list2) -> list1.getFirst() + list1.get(1) - list2.getFirst() - list2.get(1));
//        return list;
//    }
//    private boolean check(int[] nums1, int[] nums2, int k, int limitSum){
//        int count = 0;
//        int i = 0;
//        int j = 0;
//        for (; i < nums1.length && nums1[i] + nums2[j] <= limitSum; i++) {
//            for (; j < nums2.length && nums1[i] + nums2[j] <= limitSum; j++) {
//                count++;
//            }
//        }
//
//
//        return count >= k;
//    }
//}