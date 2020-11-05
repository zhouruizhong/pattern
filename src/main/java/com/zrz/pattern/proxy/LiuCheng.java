package com.zrz.pattern.proxy;

/**
 * 面试官-刘成
 * @author 周瑞忠
 */
public class LiuCheng implements Interview {

    private static final String CLASS_NAME = "刘成";

    @Override
    public void interview(String name) {
        System.out.println(CLASS_NAME + "开始面试，面试者是：" + name);
    }
}
