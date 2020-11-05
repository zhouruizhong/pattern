package com.zrz.pattern.facade;

/**
 * 模拟写信人
 * @author 周瑞忠
 */
public class Client {

  public static void main(String[] args) {
    //
      String context = "你好啊，大佬！最近还好吗！";
      String address = "湖北省武汉市东西湖区火凤凰云基地";
      ModenPostOffice modenPostOffice = new ModenPostOffice();
      modenPostOffice.sendLetter(context, address);
  }
}
