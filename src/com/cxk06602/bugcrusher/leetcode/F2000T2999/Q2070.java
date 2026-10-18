package com.cxk06602.bugcrusher.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q2070 {
    static void main() {
//        int[] ints = new Solution().maximumBeauty(new int[][]{{1, 2}, {3, 2}, {2, 4}, {5, 6},{3,5}}, new int[]{1,2,3,4,5,6});
//        //{{1, 2}, {2, 4}, {3, 2}, {3,5}, {5, 6}}
//        for (int anInt : ints) {
//            System.out.print(anInt + " ");
//        }
    }
}

//class Solution {
//
//    List<int[]> maxList = new ArrayList<>();
//
//    public int[] maximumBeauty(int[][] items, int[] queries) {
//        Arrays.sort(items, Comparator.comparingInt(a -> a[0]));
//        int max = 0;
//        for (int i = 0; i < items.length; i++) {
//            if(items[i][1] > max){
//                max = items[i][1];
//                maxList.add(new int[]{items[i][0], max});
//            }
//        }
//        int[] ans = new int[queries.length];
//        for (int i = 0; i < queries.length; i++) {
//            int index = binarySearch(maxList, queries[i]);
//            //[0,index]注意闭区间为符合条件的
//            if(index == -1){
//                ans[i] = 0;
//                continue;
//            }
//            ans[i] = maxList.get(index)[1];
//        }
//        return ans;
//    }
//    private int binarySearch(List<int[]> list, int target){
//        int left = -1;
//        int right = list.size();
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(list.get(mid)[0] <= target){
//                left = mid;
//            }else{
//                right = mid;
//            }
//        }
//        return left;
//    }
//}