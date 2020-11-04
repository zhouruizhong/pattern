package com.zrz.pattern.strategy;

/**
 * @author 周瑞忠
 */
public class PlanA implements Strategy{

    @Override
    public void operation() {
        System.out.println("执行A计划");
    }
}
