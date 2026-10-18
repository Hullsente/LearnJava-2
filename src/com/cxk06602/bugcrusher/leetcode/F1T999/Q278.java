package com.cxk06602.bugcrusher.leetcode.F1T999;

public class Q278 {
    static void main() {
//        System.out.println(new Solution(5).firstBadVersion(5));
    }
}

//class Solution extends VersionControl {
//    public Solution(int bad) {
//        super(bad);
//    }
//
//    public int firstBadVersion(int n) {
//        int left = 0;
//        int right = n;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(isBadVersion(mid)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//}
//class VersionControl{
//    private int bad;
//
//    public VersionControl(int bad) {
//        this.bad = bad;
//    }
//
//    public boolean isBadVersion(int version){
//        return version >= bad;
//    }
//}