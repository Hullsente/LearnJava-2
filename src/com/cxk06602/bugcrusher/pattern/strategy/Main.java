package com.cxk06602.bugcrusher.pattern.strategy;


import strategy.ducks.BlueDuck;
import strategy.ducks.GreenDuck;
import strategy.ducks.RedDuck;
import strategy.ducks.YellowDuck;

public class Main {
    /**
     * @apiNote 用来演示23种设计模式中的策略模式的类
     */
    static void main() {
        //在网上，是可以看到策略模式是可以优化大量的if else或switch case语句的，但是就会发现如果传进来的参数对应一个Duck的子类，那么匹配这
        // 个行为不还是要写if else或者switch case语句吗？
        //如果有学过集合的人可能看出来了，一个参数对应一个Duck的子类，这个不是用HashMap吗，很对，结果就是HashMap，提前把参数对应的Duck子类
        // 写上，然后如果有参数传过来就去查询，那么复杂度与if或switch一样是O(1)并且比if或switch简洁，所以就符合网上说的优化了

        //核心就是利用OOP的多态，把原本写死的方法通过父类字段中的接口实现类配合动态绑定去调用重写的方法，使代码更加灵活，并自由选择想要的策略

        //优点
        //首先简洁了一堆条件判断语句
        //其次策略变得灵活和易更改
        //分离了策略与使用

        //缺点
        //从第三行的优点可以看出如果策略很多就出现类爆炸现象
        //客户端需要了解类的不同并调用所需策略类
        Duck duck;


        System.out.println(lineContent("蓝色鸭子部分"));
        duck = new BlueDuck();
        duck.eat();
        duck.swing();
        duck.fly();

        System.out.println(lineContent("绿色鸭子部分"));
        duck = new GreenDuck();
        duck.eat();
        duck.swing();
        duck.fly();

        System.out.println(lineContent("红色鸭子部分"));
        duck = new RedDuck();
        duck.eat();
        duck.swing();
        duck.fly();

        System.out.println(lineContent("黄色鸭子部分"));
        duck = new YellowDuck();
        duck.eat();
        duck.swing();
        duck.fly();
    }

    static String lineContent(String content) {
        return "----------" + content + "----------";
    }
}
