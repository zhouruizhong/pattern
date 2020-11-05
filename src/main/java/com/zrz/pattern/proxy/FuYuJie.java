package com.zrz.pattern.proxy;

/**
 * 人事
 * @author 周瑞忠
 */
public class FuYuJie implements Reception {

    @Override
    public void reception(String name) {
        System.out.println("接待");
    }

    @Override
    public void recruit(String content) {
        System.out.println("发布招聘");
    }
}
