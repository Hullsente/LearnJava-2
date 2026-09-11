package com.cxk06602.bugcrusher.leetcode;

import java.util.HashMap;

public class LCP68 {
    static void main() {

    }
}

//class Solution {
//    public int beautifulBouquet(int[] flowers, int cnt) {
//        int n = flowers.length;
//        int left = 0, count = 0;
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            hashMap.merge(flowers[i], 1, Integer::sum);
//            while(hashMap.get(flowers[i]) > cnt){
//                int keyCount = hashMap.get(flowers[left]);
//                if(keyCount == 1){
//                    hashMap.remove(flowers[left]);
//                }else{
//                    hashMap.put(flowers[left], keyCount - 1);
//                }
//                left++;
//            }
//        }
//        return count;
//    }
//}