package com.cxk06602.bugcrusher.pattern.decorator.decorator;

import com.cxk06602.bugcrusher.pattern.decorator.Beverage;

public class Pudding extends ToppingDecorator{
    private final int COST = 2;

    public Pudding(Beverage beverage) {
        super(beverage);
    }


    @Override
    public int cost() {
        System.out.println("花费2块");
        return COST + beverage.cost();
    }
}
