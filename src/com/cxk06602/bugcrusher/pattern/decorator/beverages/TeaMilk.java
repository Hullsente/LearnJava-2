package com.cxk06602.bugcrusher.pattern.decorator.beverages;

import com.cxk06602.bugcrusher.pattern.decorator.Beverage;

public class TeaMilk extends Beverage {
    @Override
    public int cost() {
        System.out.println("花费6块");
        return 6;
    }
}
