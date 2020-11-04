package com.zrz.pattern.proxy;

/**
 * 前台
 * @author 周瑞忠
 */
public interface Reception {
    /**
     * 接待
     * @param name 访客名称
     */
    void reception(String name);

    /**
     * 发布招聘
     * @param content 招聘内容
     */
    void recruit(String content);

}
