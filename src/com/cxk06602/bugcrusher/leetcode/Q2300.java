package com.cxk06602.bugcrusher.leetcode;

import java.util.Arrays;
import java.util.EnumSet;

public class Q2300 {
    static void main() {

    }
}
//
//class Solution {
//    public int[] successfulPairs(int[] spells, int[] potions, long success) {
//        int[] pairs = new int[spells.length];
//        Arrays.sort(potions);
//        for (int i = 0; i < spells.length; i++) {
//            int spell = spells[i];
//            int successCount = potions.length - binarySearch(potions, success, spell);
//            pairs[i] = successCount;
//        }
//
//        return pairs;
//    }
//    private int binarySearch(int[] potions, long target, int spell){
//        int left = -1;
//        int right = potions.length;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if((long) potions[mid] * spell >= target){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//}