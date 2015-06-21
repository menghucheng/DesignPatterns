package com.mhc.FactoryPattern.imooc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by mhc on 15-6-20.
 */
public class PropertiesReader {
    public Map<String,String> getProperties(){
        Map<String,String> map = new HashMap<>();
        Properties properties = new Properties();
        InputStream in = getClass().getResourceAsStream("hair.properties");
        try {
            properties.load(in);
            Enumeration en = properties.propertyNames();
            while(en.hasMoreElements()){
                String key = (String)en.nextElement();
                String value = properties.getProperty(key);
                map.put(key,value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  map;
    }

}
