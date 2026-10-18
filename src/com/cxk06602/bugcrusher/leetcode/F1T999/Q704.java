package com.cxk06602.bugcrusher.leetcode;

public class Q704 {
    static void main() {

    }
}

//class Solution {
//    public int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] >= target) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        if (left == -1 || left == nums.length || target != nums[left]) {
//            return -1;
//        }
//        return left;
//    }
//}