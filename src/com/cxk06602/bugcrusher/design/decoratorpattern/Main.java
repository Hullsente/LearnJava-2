package com.cxk06602.bugcrusher.design.decoratorpattern;

import com.cxk06602.bugcrusher.design.decoratorpattern.beverages.Coffee;
import com.cxk06602.bugcrusher.design.decoratorpattern.beverages.TeaMilk;
import com.cxk06602.bugcrusher.design.decoratorpattern.decorator.Boba;
import com.cxk06602.bugcrusher.design.decoratorpattern.decorator.Pudding;

public class Main {
    static void main() {
        Beverage beverage = new Coffee();

        beverage = new Boba(beverage);
        beverage = new Boba(beverage);
        beverage = new Pudding(beverage);

        System.out.println(beverage.cost());

        System.out.println("==========");

        Beverage beverage1 = new TeaMilk();

        beverage1 = new Boba(beverage1);
        beverage1 = new Boba(beverage1);
        beverage1 = new Pudding(beverage1);

        System.out.println(beverage1.cost());
    }
}
