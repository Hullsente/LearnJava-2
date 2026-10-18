package com.cxk06602.bugcrusher.leetcode;

import java.lang.ref.PhantomReference;
import java.util.HashMap;

public class Q4008 {
    static void main() {
        //内存小号是击败了100%
//        System.out.println(new Solution().minInitialStrength(new int[]{5,10,15}, new int[][]{{1,1,10}}));
//        System.out.println(new Solution().minInitialStrength(new int[]{5,10,15}, new int[][]{{1,2,10},{1,2,5}}));
//        System.out.println(new Solution().minInitialStrength(new int[]{738260286}, new int[][]{{0,0,779345931},{0,0,322031493},{0,0,512569541},{0,0,621512189},{0,0,322982288}}));
    }
}

//class Solution {
//    public long minInitialStrength(int[] monsters, int[][] boosts) {
//        HashMap<Integer, Long> startAdd = new HashMap<>();
//        HashMap<Integer, Long> endAdd = new HashMap<>();
//        for (int[] boost : boosts){
//            startAdd.merge(boost[0], (long) boost[2], Long::sum);
//            endAdd.merge(boost[1], (long) boost[2], Long::sum);
//        }
//        long left = -1;
//        long right = 0;
//        for(int x : monsters){
//            right += x;
//        }
//        right++;
//        while(left + 1 < right){
//            long mid = left + (right - left) / 2;
//            if(check(monsters, mid, startAdd, endAdd)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return right;
//    }
//    private boolean check(int[] monsters, long wantOriginalSpeed, HashMap<Integer, Long> startAdd, HashMap<Integer, Long> endAdd){
//        long bonus = 0;
//        for (int i = 0; i < monsters.length; i++) {
//            bonus += startAdd.getOrDefault(i, Long.valueOf(0));
//            if(wantOriginalSpeed + bonus >= monsters[i]){
//                wantOriginalSpeed -= monsters[i];
//                if(wantOriginalSpeed < 0)wantOriginalSpeed = 0;
//            }else{
//                return false;
//            }
//            bonus -= endAdd.getOrDefault(i, Long.valueOf(0));
//        }
//        return true;
//    }
//}