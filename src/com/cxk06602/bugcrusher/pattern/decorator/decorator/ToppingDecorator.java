package com.cxk06602.bugcrusher.pattern.decorator.decorator;

import com.cxk06602.bugcrusher.pattern.decorator.Beverage;

public abstract class ToppingDecorator extends Beverage {
    protected Beverage beverage;

    public ToppingDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
