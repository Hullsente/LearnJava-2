package com.cxk06602.bugcrusher.leetcode.F1T999;

public class Q374 {
    static void main() {
//        System.out.println(new Solution(6).guessNumber(10));
    }
}
//class Solution extends GuessGame {
//    public Solution(int pick) {
//        super(pick);
//    }
//
//    public int guessNumber(int n) {
//        int left = 0;
//        int right = n;
//        while(left + 1 < right){
//            int mid = left + right >>> 1;
//            if(guess(mid) <= 0){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//}
//
//class GuessGame{
//    private int pick;
//
//    public GuessGame(int pick) {
//        this.pick = pick;
//    }
//    public int guess(int num){
//        if(num > pick)return -1;
//        else if(num < pick)return 1;
//        return 0;
//    }
//}