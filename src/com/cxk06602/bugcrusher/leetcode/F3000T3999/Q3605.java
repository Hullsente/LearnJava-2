package com.cxk06602.bugcrusher.leetcode;

public class Q3605 {
    static void main() {

    }
}

//class Solution {
//    public int minLength(String S, int numOps) {
//        char[] s = S.toCharArray();
//        int left = 0;
//        int right = s.length;
//        while(left + 1 < right){
//            int mid = left + right >>> 1;
//            if(check(s, numOps, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(char[] s, int numOps, int tryLength){
//        int count = 0;
//        int n = s.length;
//        if(tryLength == 1){
//            //看是不是01010101.....
//            for (int i = 0; i < n; i++) {
//                count += (s[i] ^ i) & 1;
//            }
//            count = Math.min(count, n - count);
//        }else {
//            int k = 0;
//            for (int i = 0; i < n; i++) {
//                k++;
//                if(i == n - 1 || s[i] != s[i + 1]){
//                    count += k / (tryLength + 1);
//                    k = 0;
//                }
//            }
//        }
//        return count <= numOps;
//    }
//}