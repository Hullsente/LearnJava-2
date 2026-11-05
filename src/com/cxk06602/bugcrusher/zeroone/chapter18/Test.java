package com.cxk06602.bugcrusher.zeroone.chapter18;

public class Test{
    static void main() {
        Ca caSum = (int _, int _) -> {
            System.out.println(1 + 2);
        };
        Ca2 ca2Sum = _ -> {
            System.out.println("a");
        };
        ca2Sum.ca(5);
    }
}
