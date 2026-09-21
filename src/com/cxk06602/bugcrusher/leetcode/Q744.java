package com.cxk06602.bugcrusher.leetcode;

public class Q744 {
    static void main() {

    }
}

//class Solution {
//    public char nextGreatestLetter(char[] letters, char target) {
//        int left = 0;
//        int right = letters.length - 1;
//        while(left <= right){
//            int mid = left + (right - left) / 2;
//            if(letters[mid] > target){
//                right = mid - 1;
//            }else{
//                left = mid + 1;
//            }
//        }
//        if(left == letters.length)left = 0;
//        return letters[left];
//    }
//}