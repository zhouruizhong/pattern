package com.zrz.pattern.facade;

/**
 * 定义一个写信的过程
 * @author 周瑞忠
 */
public interface LetterProcess {
    /**
     * 写信
     * @param context 信的内容
     */
    public void writeContext(String context);

    /**
     * 填写信封
     * @param address 邮寄地址
     */
    public void fillEnvelope(String address);

    /**
     * 放入信封
     */
    public void letterInotoEnvelope();

    /**
     * 发送
     */
    public void sendLetter();
}
