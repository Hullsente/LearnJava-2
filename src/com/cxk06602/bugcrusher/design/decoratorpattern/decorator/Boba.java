package com.cxk06602.bugcrusher.design.decoratorpattern.decorator;

import com.cxk06602.bugcrusher.design.decoratorpattern.Beverage;

public class Boba extends ToppingDecorator{
    private final int COST = 1;

    public Boba(Beverage beverage) {
        super(beverage);
    }


    @Override
    public int cost() {
        System.out.println("花费1块");
        return COST + beverage.cost();
    }
}
