package com.cxk06602.bugcrusher.pattern.strategy;

//注意：实现了FlyBehavior接口的类里面的实现方法fly都是具体的策略
public abstract class Duck {
    //推荐使用private，符合OOP的最小权限原则
    protected FlyBehavior flyBehavior;
    //构造器必须有一个飞行的行为
    public Duck(FlyBehavior flyBehavior) {
        if(flyBehavior == null)throw new NullPointerException("默认构造不可以为null，必须要有飞行行为的方法实现");
        this.flyBehavior = flyBehavior;
    }
    //运行实现的各种飞的行为
    public void fly(){
        flyBehavior.fly();
    }
    //每个鸭子没有差别的部分
    public void swing(){
        System.out.println("统一的游泳行为");
    }
    //每个鸭子没有差别的部分
    public void eat(){
        System.out.println("统一的吃行为");
    }
    //根据业务逻辑方便修改
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
