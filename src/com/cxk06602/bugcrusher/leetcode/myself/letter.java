package com.cxk06602.bugcrusher.leetcode.myself;

//运行环境：Java 27
public class letter {
    static void main() {
        System.out.println(stringLetterKindCount("hello"));
    }
    static int stringLetterKindCount(String S){
        char[] s = S.toCharArray();
        int count = 0;
        for (char c : s) {
            count |= 1 << (c - 'a');
        }
        return Integer.bitCount(count);
    }
}
