package com.cxk06602.bugcrusher.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q475 {
    static void main() {

    }
}


//class Solution {
//    public int findRadius(int[] houses, int[] heaters) {
//        Arrays.sort(houses);
//        Arrays.sort(heaters);
//
//        int left = -1;
//        int right = (int) 1e9;
//        while(left + 1 < right){
//            int mid = right + left >>> 1;
//            if(check(houses, heaters, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] houses, int[] heaters, int r){
//        int n = houses.length;
//        int m = heaters.length;
//        for (int i = 0, j = 0; i < n; i++) {
//            while(j < m && houses[i] > heaters[j] + r)j++;
//            if(j < m && houses[i] <= heaters[j] + r && houses[i] >= heaters[j] - r)continue;
//            return false;
//        }
//        return true;
//    }
//}