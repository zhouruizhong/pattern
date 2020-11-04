package com.zrz.pattern.proxy;

/**
 * 前台-王施
 * @author 周瑞忠
 */
public class WangShi implements Reception,Interview {

    private Reception reception;
    private Interview interview;

    /**
     * 默认代理宴杰
     */
    public WangShi(){
        this.reception = new YanJie();
        this.interview = new YanJie();
    }

    /**
     * 动态代理其他人
     * @param reception 其他面试官
     */
    public WangShi(Reception reception){
        this.reception = reception;
    }

    public WangShi(Interview interview){
        this.interview = interview;
    }

    @Override
    public void reception(String name) {
        this.reception.reception(name);
    }

    @Override
    public void recruit(String content) {
        this.reception.recruit(content);
    }

    @Override
    public void interview(String name) {
        this.interview.interview(name);
    }
}
