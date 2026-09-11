package com.cxk06602.bugcrusher.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q632 {
    static void main() {

    }
}
//class Solution {
//    public int[] smallestRange(List<List<Integer>> nums) {
//        int sumLength = 0;
//        for(List<Integer> num: nums){
//            sumLength += num.size();
//        }
//        int[][] arr = new int[sumLength][2];
//        for (int i = 0; i < nums.size(); i++) {
//            for (int j = 0; j < nums.get(i).size(); j++) {
//                arr[i][0] = nums.get(i).get(j);
//                arr[i][1] = i;
//            }
//        }
//        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
//
//        int n = arr.length;
//        int left = 0;
//        int empty = nums.size();
//        int ansLeft = arr[0][0], ansRight = arr[nums.size() - 1][0];
//        int[] arrCount = new int[nums.size()];
//        for (int i = 0; i < n; i++) {
//            if(arrCount[arr[i][1]] == 0)empty--;
//            arrCount[arr[i][1]]++;
//            while(empty == 0){
//                if(arr[i][0] - arr[left][0] < ansLeft - ansRight){
//                    ansLeft = arr[left][0];
//                    ansRight = arr[i][0];
//                }
//                arrCount[arr[left][1]]--;
//                if(arrCount[arr[left][1]] == 0)empty++;
//                arrCount[arr[left][1]]--;
//                left++;
//            }
//        }
//        return new int[]{ansLeft, ansRight};
//    }
//}
