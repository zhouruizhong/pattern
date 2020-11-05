package com.zrz.pattern.proxy;

/**
 * 面试者
 * @author 周瑞忠
 */
public class Interviewers {

  public static void main(String[] args) throws Exception {
      WangShi wangShi;
      //发布招聘
      wangShi = new WangShi(new FuYuJie());
      wangShi.recruit("招聘JAVA 3 名");

      //模拟招聘等待
      Thread.sleep(5000);

      // 面试
      wangShi = new WangShi(new LiuCheng());
      wangShi.interview("张三");
  }
}
