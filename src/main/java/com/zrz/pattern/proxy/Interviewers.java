package com.zrz.pattern.proxy;

/**
 * 面试者
 * @author 周瑞忠
 */
public class Interviewers {

  public static void main(String[] args) throws Exception {
      WangShi wangShi = new WangShi((Interview) new LiuCheng());
      //发布招聘
      /*wangShi.recruit("招聘JAVA 3 名");
      Thread.sleep(5000);*/
      // 面试
      wangShi.interview("张三");
  }
}
