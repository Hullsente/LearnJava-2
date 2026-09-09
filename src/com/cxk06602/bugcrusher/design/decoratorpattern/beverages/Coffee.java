package com.cxk06602.bugcrusher.design.decoratorpattern.beverages;

import com.cxk06602.bugcrusher.design.decoratorpattern.Beverage;

public class Coffee extends Beverage {

    @Override
    public int cost() {
        System.out.println("花费9块");
        return 9;
    }
}
