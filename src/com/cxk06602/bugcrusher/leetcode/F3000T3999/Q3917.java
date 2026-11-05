package com.cxk06602.bugcrusher.leetcode.F3000T3999;

public class Q3917 {
    static void main() {

    }
}

//class Solution {
//    public int[] countOppositeParity(int[] nums) {
//        int[] ans = new int[nums.length];
//        int oddCount = 0;//奇数
//        int evenCount = 0;//偶数
//        for(int i = nums.length - 1; i >= 0; --i){
//            if((nums[i] & 1) == 0){
//                ans[i] = oddCount;
//                ++evenCount;
//            } else{
//                ans[i] = evenCount;
//                ++oddCount;
//            }
//        }
//        return ans;
//    }
//}