package com.zrz.pattern.strategy;

/**
 * @author 周瑞忠
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void operation(){
        strategy.operation();
    }
}
