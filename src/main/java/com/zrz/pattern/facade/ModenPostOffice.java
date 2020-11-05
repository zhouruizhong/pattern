package com.zrz.pattern.facade;

/**
 * 聚合写信的具体流程
 * @author 周瑞忠
 */
public class ModenPostOffice {

    private LetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
