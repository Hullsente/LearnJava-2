package com.cxk06602.bugcrusher.leetcode;

import java.util.Arrays;

public class Q3048 {
    static void main() {
//        System.out.println(new Solution().earliestSecondToMarkIndices(new int[]{2,2,0}, new int[]{2,2,2,2,3,2,2,1}));
    }
}




// -------------------->不可使用
//class Solution {
//    public int earliestSecondToMarkIndices(int[] nums, int[] changeIndices) {
//        int[] marker = new int[nums.length];
//        int left = nums.length - 2;
//        int right = (int) 1e9 + 1;
//        while (left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(check(Arrays.copyOf(nums, nums.length), changeIndices, mid, marker)){
//                right = mid;
//            }else {
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] nums, int[] changeIndices, int wantSec, int[] marker){
//        wantSec++;
//        int canRemoveOneCount = 0;
//        for (int i = 0; i < changeIndices.length; i++) {
//            if(nums[changeIndices[i] - 1] - canRemoveOneCount <= 0 && nums[changeIndices[i] - 1] != 0){
//                canRemoveOneCount -= nums[changeIndices[i] - 1];
//                nums[changeIndices[i] - 1] = 0;
//                marker[changeIndices[i] - 1] = wantSec;
//            }else if(nums[changeIndices[i] - 1] == 0){
//                marker[changeIndices[i] - 1] = wantSec;
//            }else{
//                canRemoveOneCount++;
//            }
//        }
//        for (int num : marker)if(num != wantSec)return false;
//        return true;
//    }
//}