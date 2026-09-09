package com.cxk06602.bugcrusher.design.decoratorpattern.beverages;

import com.cxk06602.bugcrusher.design.decoratorpattern.Beverage;

public class FruitMile extends Beverage {
    @Override
    public int cost() {
        System.out.println("花费4块");
        return 4;
    }
}
