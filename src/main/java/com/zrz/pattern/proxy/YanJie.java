package com.zrz.pattern.proxy;

/**
 * 面试官-宴杰
 * @author 周瑞忠
 */
public class YanJie implements Interview {

    @Override
    public void interview(String name) {
        System.out.println("开始面试，面试者是：" + name);
    }
}
