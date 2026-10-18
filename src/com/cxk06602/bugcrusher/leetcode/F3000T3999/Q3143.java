package com.cxk06602.bugcrusher.leetcode;

public class Q3143 {
    static void main() {
//        System.out.println(new Solution().maxPointsInsideSquare(new int[][]{{2,2},{-1,-2},{-4,4},{-3,1},{3,-3}}, "abdca"));
    }
}

//class Solution {
//    private int ans = 0;
//    public int maxPointsInsideSquare(int[][] points, String S) {
//        char[] s = S.toCharArray();
//        int left = -1;
//        int right = 1000000001;
//        while(left + 1 < right){
//            int mid = left + right >>> 1;
//            if(check(points, s, mid)){
//                left = mid;
//            }else{
//                right = mid;
//            }
//        }
//        return ans;
//    }
//    private boolean check(int[][] points, char[] s, int tryLength){
//        int binStorage = 0;
//        for (int i = 0; i < points.length; i++) {
//            if(Math.abs(points[i][0]) <= tryLength && Math.abs(points[i][1]) <= tryLength){
//                int n = s[i] - 'a';
//                if(((binStorage >> n) & 1) == 1){
//                    return false;
//                }
//                binStorage |= 1 << n;
//            }
//        }
//        ans = Integer.bitCount(binStorage);
//        return true;
//    }
//}
