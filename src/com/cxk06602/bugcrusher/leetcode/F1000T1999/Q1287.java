package com.cxk06602.bugcrusher.leetcode;

public class Q1287 {
    static void main() {
//        new Solution().findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10});
    }
}


//class Solution {
//    public int findSpecialInteger(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int mostRightIndex = search(arr, arr[i]);
//            if(mostRightIndex - i + 1 > 1.0 * arr.length / 4)return arr[i];
//            i = mostRightIndex;
//        }
//
//        //不可能到达的语句
//        return 0;
//    }
//    private int search(int[] arr, int target){
//        int left = -1;
//        int right = arr.length;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(arr[mid] <= target){
//                left = mid;
//            }else{
//                right = mid;
//            }
//        }
//        return left;
//    }
//}