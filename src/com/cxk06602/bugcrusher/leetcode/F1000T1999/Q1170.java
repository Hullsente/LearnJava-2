package com.cxk06602.bugcrusher.leetcode;

import java.util.Arrays;

public class Q1170 {
    static void main() {

    }
}

//class Solution {
//    public int[] numSmallerByFrequency(String[] queries, String[] words) {
//        int[] ans = new int[queries.length];
//        for(int i = 0; i < queries.length; i++){
//            int count = 0;
//            char[] query = queries[i].toCharArray();
//            Arrays.sort(query);
//            int queryCount = binarySearch(query, query[0] + 1);
//            for(String Word : words){
//                char[] word = Word.toCharArray();
//                Arrays.sort(word);
//
//                int wordCount = binarySearch(word, word[0] + 1);
//                if(queryCount < wordCount)count++;
//            }
//            ans[i] = count;
//        }
//        return ans;
//    }
//    private int binarySearch(char[] arr, int target){
//        int left = 0;
//        int right = arr.length - 1;
//        while(left <= right){
//            int mid = left + (right - left) / 2;
//            if(arr[mid] >= target){
//                right = mid - 1;
//            }else{
//                left = mid + 1;
//            }
//        }
//        return left;
//    }
//}