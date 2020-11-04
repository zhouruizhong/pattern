package com.zrz.pattern.strategy;

/**
 * @author 周瑞忠
 */
public class PlanC implements Strategy{

    @Override
    public void operation() {
        System.out.println("执行C计划");
    }
}
