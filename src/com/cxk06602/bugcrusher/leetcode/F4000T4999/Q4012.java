package com.cxk06602.bugcrusher.leetcode;

import java.util.Arrays;

public class Q4012 {
    static void main() {
        //1,5,9
        //9,1,4
//        new Solution().countTasks(new int[]{4,2}, new int[]{3,6,1});


        //2,5,9
        //20,4,5
        //只要到了数组的末尾索引，就把需要添加的变量设置为0，
        // 只要没到末尾索引，就把需要添加的变量+=当前没有完成的


        //4,6
        //3,6,1
    }
}

////灵神写的
//class Solution {
//    public int[] countTasks(int[] tasks, int[] shifts) {
//        int n = tasks.length;
//        long[] s = new long[n];
//        s[0] = tasks[0];
//        for (int i = 1; i < n; i++) {
//            s[i] = s[i - 1] + tasks[i];
//        }
//
//        long t = 0;
//        for (int i = 0; i < shifts.length; i++) {
//            t += shifts[i];
//            if (t >= s[n - 1]) { // 完成所有任务
//                t = 0;
//                shifts[i] = 0;
//            } else {
//                // s 无重复元素，可以用库函数二分
//                int j = Arrays.binarySearch(s, t + 1);
//                if (j < 0) j = ~j; // 见 Arrays.binarySearch 源码
//                shifts[i] = n - j;
//            }
//        }
//
////我写的
//class Solution {
//    public int[] countTasks(int[] tasks, int[] shifts) {
//        int n = tasks.length;
//        long[] s = new long[n];
//        s[0] = tasks[0];
//        for (int i = 1; i < n; i++) {
//            s[i] = s[i - 1] + tasks[i];
//        }
//
//        long t = 0;
//        for (int i = 0; i < shifts.length; i++) {
//            t += shifts[i];
//            if (t >= s[n - 1]) { // 完成所有任务
//                t = 0;
//                shifts[i] = 0;
//            } else {
//                // s 无重复元素，可以用库函数二分
//                int j = Arrays.binarySearch(s, t + 1);
//                if (j < 0) j = ~j; // 见 Arrays.binarySearch 源码
//                shifts[i] = n - j;
//            }
//        }
//        return shifts;
//    }
//}