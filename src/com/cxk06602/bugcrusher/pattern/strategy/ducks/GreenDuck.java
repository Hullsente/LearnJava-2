package com.cxk06602.bugcrusher.pattern.strategy.ducks;


import com.cxk06602.bugcrusher.pattern.strategy.Duck;
import com.cxk06602.bugcrusher.pattern.strategy.flybehavior.HighFly;

public class GreenDuck extends Duck {
    //初始构造固定的飞行策略，可调用setFlyBehavior方法去修改策略
    public GreenDuck() {
        super(new HighFly());
    }
}
