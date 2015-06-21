package com.mhc.singleton;

/**
 * 这个是单例模式 直接创建
 * Created by mhc on 15-6-20.
 */
public class Singleton1 {
    private static Singleton1 Instance=new Singleton1();
    //如果需要一开始就创建而不是需要时再创建，可以直接在上面new,急切的创建实例,保证了线程的安全
    private Singleton1(){

    }

    public static Singleton1 getInstance(){//多线程的话可以考虑加锁这个函数:w
          return Instance;
    }
}
