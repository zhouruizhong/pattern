package com.zrz.pattern.proxy;

/**
 * 面试官-刘成
 * @author 周瑞忠
 */
public class LiuCheng implements Reception, Interview {

    private static final String CLASS_NAME = "刘成";

    @Override
    public void reception(String name) {
        System.out.println(CLASS_NAME + "开始接待，被接待人是：" + name);
    }

    @Override
    public void recruit(String content) {
        System.out.println(CLASS_NAME + "开始招聘，内容是：" + content);
    }

    @Override
    public void interview(String name) {
        System.out.println(CLASS_NAME + "开始面试，面试者是：" + name);
    }
}
