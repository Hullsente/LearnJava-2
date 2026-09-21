package com.cxk06602.bugcrusher.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q3488 {
    static void main() {
//        List<Integer> list = new Solution().solveQueries(new int[]{1,3,1,4,1,3,2}, new int[]{0,3,5});
//        for(int n : list){
//            System.out.println(n);
//        }
    }
}

//class Solution {
//    public List<Integer> solveQueries(int[] nums, int[] queries) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        HashMap<Integer, ArrayList<Integer>> integerArrayListHashMap = new HashMap<>();
//        for (int i = 0; i < 3 * nums.length; i++) {
//            integerArrayListHashMap.computeIfAbsent(nums[i % nums.length], _ -> new ArrayList<>()).add(i);
//        }
//        for (int i = 0; i < queries.length; i++) {
//            int wantFind = nums[queries[i]];
//            //1 = 0 2 4 | 7 9 11 | 14 16 18
//            //3 = 1 5 | 8 12 | 15 19
//            ArrayList wantArrayList = integerArrayListHashMap.get(wantFind);
//            int wantFindIndex = binarySearch(wantArrayList, queries[i] + nums.length);
//            int wantFindIndexOfIndex = (Integer) wantArrayList.get(wantFindIndex);
//            int big = (Integer)wantArrayList.get(wantFindIndex + 1);
//            int small = (Integer)wantArrayList.get(wantFindIndex - 1);
//            int minLength = Math.min(big - wantFindIndexOfIndex, wantFindIndexOfIndex - small);
//            if(minLength == nums.length)minLength = -1;
//            ans.add(minLength);
//        }
//        return ans;
//    }
//    private int binarySearch(List<Integer> list, int target){
//        int left = 0;
//        int right = list.size() - 1;
//        while(left <= right){
//            int mid = left + (right - left) / 2;
//            if(list.get(mid) >= target){
//                right = mid - 1;
//            }else{
//                left = mid + 1;
//            }
//        }
//        return left;
//    }
//}