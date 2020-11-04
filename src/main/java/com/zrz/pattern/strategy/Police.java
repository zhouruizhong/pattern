package com.zrz.pattern.strategy;

/**
 * 策略模式
 * @author 周瑞忠
 */
public class Police {

  public static void main(String[] args) {
    // 事先定好单个计划
    PlanA planA = new PlanA();
    PlanB planB = new PlanB();
    PlanC planC = new PlanC();

    Context context;
    // 执行A计划
    context = new Context(planA);
    context.operation();

    // 执行B计划
    context = new Context(planB);
    context.operation();

    // 执行C计划
    context = new Context(planC);
    context.operation();
  }
}
