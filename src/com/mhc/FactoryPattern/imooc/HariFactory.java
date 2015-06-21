package com.mhc.FactoryPattern.imooc;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mhc on 15-6-20.
 */
public class HariFactory {
    /**
     *这种方法不推荐，因为当子类多的时候修改和添加都需要修改代码 很不方便
     * @param name
     * @return
     */
    public Hair getHairByName(String name){
        if("left".equals(name)){
            return new LeftHair();
        }else if("right".equals(name)){
            return new RightHair();
        }else if("in".equals(name)){
            return new InHair();
        }else{
            return null;
        }
    }

    /**
     *
     * @param className  必须是全名 如 com.mhc.FactoryPattern.imooc.InHair
     * @return
     */
    public Hair getHairByClassName(String className){
        Hair hair=null;
        try {
             hair= (Hair) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return hair;
    }

    /**
     *
     * @param ShortName 类的简称
     * @return
     */
    public Hair getHairByShortName(String ShortName){
        Hair hair=null;
        Map<String,String> map = new PropertiesReader().getProperties();
        try {
            hair= (Hair) Class.forName(map.get(ShortName)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return hair;
    }


}
