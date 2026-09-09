package com.cxk06602.bugcrusher.design.decoratorpattern.beverages;

import com.cxk06602.bugcrusher.design.decoratorpattern.Beverage;

public class TeaMilk extends Beverage {
    @Override
    public int cost() {
        System.out.println("花费6块");
        return 6;
    }
}
