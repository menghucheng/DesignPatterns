package com.mhc.FactoryPattern.imooc;

import java.util.Map;

/**
 * https://gist.github.com/menghucheng/5831dfabf6b93707b346
 * Created by mhc on 15-6-20.
 */
public class FactoryTest {
    public static void main(String [] args){
        Hair hair = null;
        HariFactory factory = new HariFactory();
//      hair = factory.getHairByName("in");
//      hair= factory.getHairByClassName("com.mhc.FactoryPattern.imooc.LeftHair");
        /**
         * 为了处理上述的输入类全名的情况  可以建立一个properties文件来建立映射关系
         */
       hair = factory.getHairByShortName("left");//在properties中配置
        if(null!=hair){
            hair.draw();
        }else {
            System.out.println("创建失败!");
        }
    }
}
