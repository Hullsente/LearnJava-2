package com.cxk06602.bugcrusher.design.decoratorpattern.decorator;

import com.cxk06602.bugcrusher.design.decoratorpattern.Beverage;

public abstract class ToppingDecorator extends Beverage {
    protected Beverage beverage;

    public ToppingDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
