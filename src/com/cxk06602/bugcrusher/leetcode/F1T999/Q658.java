package com.cxk06602.bugcrusher.leetcode;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Q658 {
    static void main() {
        //System.out.println(new Solution().findClosestElements(new int[]{0,1,1,1,2,3,6,7,8,9}, 9, 4));
//        System.out.println(new Solution().findClosestElements(new int[]{3,5,8,10}, 2, 15));
    }
}

//
//class Solution {
//    public List<Integer> findClosestElements(int[] arr, int k, int x) {
//        int index = search(arr, x);
//        if(index == arr.length)index--;
//        if(arr[index] == x)k--;
//        //开区间
//        int leftIndex = index - 1;
//        int rightIndex = arr[index] == x ? index + 1 : index;
//        List<Integer> list = new ArrayList<>();
//        int count = 0;
//        while(count < k){
//            count++;
//            if(rightIndex == arr.length){
//                leftIndex--;
//                continue;
//            }
//            if(leftIndex < 0){
//                rightIndex++;
//                continue;
//            }
//
//            if(x - arr[leftIndex] > arr[rightIndex] - x){
//                rightIndex++;
//            }else{
//                leftIndex--;
//            }
//        }
//
//        for (int i = leftIndex + 1; i < rightIndex; i++) {
//            list.add(arr[i]);
//        }
//        return list;
//    }
//    private int search(int[] arr, int target){
//        int left = -1;
//        int right = arr.length;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(arr[mid] >= target){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//}