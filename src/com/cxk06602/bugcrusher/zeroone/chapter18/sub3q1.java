package com.cxk06602.bugcrusher.zeroone.chapter18;

public class sub3q1 {
    static void main() {
        USB usb = new USB() {
            @Override
            public void check(int i) {
                System.out.println(i);
            }
        };
        usb.check(5);
    }
}
