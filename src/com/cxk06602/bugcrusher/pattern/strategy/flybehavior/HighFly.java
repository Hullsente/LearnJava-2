package com.cxk06602.bugcrusher.pattern.strategy.flybehavior;

import com.cxk06602.bugcrusher.pattern.strategy.FlyBehavior;

public class HighFly implements FlyBehavior {
    //飞行为的具体实现方法，用类来定义各种的飞
    @Override
    public void fly() {
        System.out.println("飞得很高");
    }
}
