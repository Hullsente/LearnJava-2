package com.cxk06602.bugcrusher.leetcode;

public class LCP08 {
    static void main() {
        //int[] ans = new Solution().getTriggerTime(new int[][]{{2,8,4},{2,5,0},{10,9,8}}, new int[][]{{2,11,3},{15,10,7},{9,17,12},{8,1,14}});
//        int[] ans = new Solution().getTriggerTime(new int[][]{{1,1,1}}, new int[][]{{0,0,0}});
//        for (int i = 0; i < ans.length; i++) {
//            System.out.print(ans[i] + " ");
//        }
    }
}

//class Solution {
//    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
//        for (int i = 1; i < increase.length; i++) {
//            increase[i][0] += increase[i - 1][0];
//            increase[i][1] += increase[i - 1][1];
//            increase[i][2] += increase[i - 1][2];
//        }
//        int cIndex = -1;
//        int rIndex = -1;
//        int hIndex = -1;
//        int[] ans = new int[requirements.length];
//        for (int i = 0; i < requirements.length; i++) {
//            cIndex = search(increase, requirements[i][0], 0);
//            rIndex = search(increase, requirements[i][1], 1);
//            hIndex = search(increase, requirements[i][2], 2);
//            if(cIndex == increase.length || rIndex == increase.length || hIndex == increase.length){
//                ans[i] = -1;
//                continue;
//            }
//            if(cIndex == 0 && rIndex == 0 && hIndex == 0 && i == 0){
//                ans[i]--;
//            }
//            ans[i] += Math.max(Math.max(cIndex, rIndex), hIndex) + 1;
//        }
//        return ans;
//    }
//    private int search(int[][] arr, int target, int kind){
//        //kind == 0 是 C
//        //kind == 1 是 R
//        //kind == 2 是 H
//        int left = -1;
//        int right = arr.length;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(arr[mid][kind] >= target){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//}
