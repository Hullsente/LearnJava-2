package com.cxk06602.bugcrusher.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class Q2080 {
    static void main() {

    }
}
//
//class RangeFreqQuery {
//    private int[] arr;
//    public RangeFreqQuery(int[] arr) {
//        this.arr = arr;
//    }
//
//    public int query(int left, int right, int value) {
//        int tempLeft = left;
//        int tempRight = right;
//        while(tempLeft <= tempRight){
//            int mid = tempLeft + (tempRight - tempLeft) / 2;
//            if(arr[mid] >= value){
//                tempRight = mid - 1;
//            }else{
//                tempLeft = mid + 1;
//            }
//        }
//        int firstIndex = tempLeft;
//        tempLeft = left;
//        tempRight = right;
//        while(tempLeft <= tempRight){
//            int mid = tempLeft + (tempRight - tempLeft) / 2;
//            if(arr[mid] >= value + 1){
//                tempRight = mid - 1;
//            }else{
//                tempLeft = mid + 1;
//            }
//        }
//        int lastIndex = tempLeft - 1;
//
//
//        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
//        hashMap.computeIfAbsent(1, _ -> new ArrayList<>()).add(1);
//
//        return lastIndex - firstIndex + 1;
//    }
//}