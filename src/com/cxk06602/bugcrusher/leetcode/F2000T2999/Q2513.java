package com.cxk06602.bugcrusher.leetcode;

public class Q2513 {
    static void main() {

    }
}

//class Solution {
//    /**
//     * @apiNote 开区间二分
//     */
//    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
//        long lcm = lcm(divisor1, divisor2);
//
//        long left = 0;
//        long right = ((long)uniqueCnt1 + uniqueCnt2) * 2;
//        while(left + 1 < right){
//            long mid = left + right >>> 1;
//            if(check(divisor1, divisor2, uniqueCnt1, uniqueCnt2, lcm, mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return (int) right;
//    }
//    private boolean check(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2, long lcm, long wantTry){
//        //求出arr1和arr2都不可以获得的数量
//        long garbageCount = wantTry / lcm;
//        //求出仅仅arr1可以获得的数量
//        long justArray1GetCount = wantTry / divisor2 - garbageCount;
//        //求出仅仅arr2可以获得的数量
//        long justArray2GetCount = wantTry / divisor1 - garbageCount;
//        //求出arr1和arr2共享的数量
//        long sharingCount = wantTry - wantTry / divisor2 - wantTry / divisor1 + garbageCount;
//        //算出还需要多少的数量，这个数量只能共享的数量中得到，用要求的uniqueCnt减去仅仅arr1可以获得的数量
//        //Math.max是为了防止出现负数，也就是意味着仅仅arr1的数量就完全够了
//        long arr1NeedSharingCount = Math.max(uniqueCnt1 - justArray1GetCount, 0);
//        long arr2NeedSharingCount = Math.max(uniqueCnt2 - justArray2GetCount, 0);
//        //算出一共要多少的共享数字的数量
//        long allNeedSharingCount = arr1NeedSharingCount + arr2NeedSharingCount;
//        //最后返回是否能够提供的布尔值
//        return sharingCount >= allNeedSharingCount;
//    }
//
//    /**
//     * @apiNote 根据最大公约数的公式算最小公倍数
//     *
//     * @param a 第一个数字
//     * @param b 第二个数字
//     * @return 第一个数字和第二个数字的最小公倍数
//     */
//
//    public static long lcm(int a, int b){
//        return (long) a * b / gcd(a, b);
//    }
//
//    /**
//     * @apiNote 辗转相除法
//     *
//     * @param a 第一个数字
//     * @param b 第二个数字
//     * @return 第一个数字和第二个数字的最大公约数
//     */
//    public static int gcd(int a, int b){
//        int min = Math.min(a,b);
//        a = Math.max(a,b);
//        b = min;
//        while(b > 0){
//            int c = a % b;
//            a = b;
//            b = c;
//        }
//        return a;
//    }
//}