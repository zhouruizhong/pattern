package com.zrz.pattern.facade;

/**
 * 实现写信到寄信过程
 * @author 周瑞忠
 */
public class LetterProcessImpl implements LetterProcess {

    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容：" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址及姓名：" + address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("放入信封");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件");
    }
}
