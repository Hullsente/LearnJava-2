package com.cxk06602.bugcrusher.leetcode.F1T999;

public class Q878 {
    static void main() {
//        System.out.println(new Solution().nthMagicalNumber(4,2,3));
    }
}

//class Solution {
//    public int nthMagicalNumber(int n, int a, int b) {
//        int lcm = lcm(a, b);
//        long left = Math.min(a, b) - 1;
//        long right = (long) Math.min(a, b) * n + 1;
//        while(left + 1 < right){
//            long mid = left + right >>> 1;
//            if(check(n, a, b, lcm, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return (int) (right % (1e9 + 7));
//    }
//    private boolean check(int n, int a, int b, int lcm, long tryNum){
//        long count = tryNum / a + tryNum / b - tryNum / lcm;
//        return count >= n;
//    }
//
//    private int lcm(int a, int b){
//        return a * b / gcd(a, b);
//    }
//    private int gcd(int a, int b){
//        //a <= b
//        int mol;
//        while(a % b != 0){
//            mol = a % b;
//            a = b;
//            b = mol;
//        }
//        return b;
//    }
//}