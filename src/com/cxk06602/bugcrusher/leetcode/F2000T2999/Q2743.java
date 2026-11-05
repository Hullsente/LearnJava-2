package com.cxk06602.bugcrusher.leetcode.F2000T2999;

public class Q2743 {
    static void main() {
//        new Solution().countBeautifulPairs(new int[]{2,5,1,4});
    }
}
//class Solution {
//    public int countBeautifulPairs(int[] nums) {
//        int n = nums.length;
//        int count = n * (n - 1) / 2;
//        int[] hashMap = new int[10000];
//        for (int i = 0; i < n; ++i) {
//            int lastNum = getLastNum(nums[i]);
//            int j = hashMap[lastNum];
//            if(gcd(j, lastNum) == 1 || j == 0){
//                count += j;
//            }
//            ++hashMap[getFisrtNum(nums[i])];
//        }
//        return count;
//    }
//    private int getLastNum(int n){
//        return n % 10;
//    }
//    private int getFisrtNum(int n){
//        int count = 1;
//        int num = n;
//        while(num > 0){
//            num /= 10;
//            count *= 10;
//        }
//        count /= 10;
//        return n / count;
//    }
//    private int gcd(int a, int b){
//        if(a * b == 0)return 0;
//        while(a != b) {
//            if(a > b) a = a - b;
//            else b = b - a;
//        }
//        return a;
//    }
//}