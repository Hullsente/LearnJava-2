package com.cxk06602.bugcrusher.leetcode.F1000T1999;

public class Q1201 {
    static void main() {
        //8
//        System.out.println(new Solution().nthUglyNumber(5,2,3,3));
    }
}
//class Solution {
//    public int nthUglyNumber(int n, int a, int b, int c) {
//        long lcmAB = lcm(a, b);
//        long lcmAC = lcm(a, c);
//        long lcmBC = lcm(b, c);
//        long lcmABC = lcm(lcm(a, b), c);
//
//        long min = Math.min(Math.min(a,b), c);
//        long left = min - 1;
//        long right = min * n + 1 < 0 ? 2000000001L : min * n + 1;
//        while(left + 1 < right){
//            long mid = right + left >>> 1;
//            if(check(n, a, b, c, lcmAB, lcmAC, lcmBC, lcmABC, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return (int) right;
//    }
//    private boolean check(long n, long a, long b, long c, long lcmAB, long lcmAC, long lcmBC, long lcmABC, long tryNum){
//        long commonABCount = tryNum / lcmAB;
//        long commonACCount = tryNum / lcmAC;
//        long commonBCCount = tryNum / lcmBC;
//        long commonABCCount = tryNum / lcmABC;
//        long count = (tryNum / a) + (tryNum / b) + (tryNum / c) -
//                commonABCount - commonACCount - commonBCCount +
//                commonABCCount;
//
//        return count >= n;
//    }
//
//
//
//    private long lcm(long a, long b){
//        return a * b / gcd(a, b);
//    }
//    private long gcd(long a, long b){
//        //a <= b
//        long mol;
//        while(a % b != 0){
//            mol = a % b;
//            a = b;
//            b = mol;
//        }
//        return b;
//    }
//}
