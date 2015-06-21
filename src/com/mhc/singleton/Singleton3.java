package com.mhc.singleton;

/**
 * 双重检查加锁(double-checked locking)，在getInstance中减少加锁,可以提高性能，减少耗费的时间
 * Created by mhc on 15-6-20.
 */
public class Singleton3 {
    private volatile static Singleton3 Instance;//volatile确保当Instance初始化成实例的时候，多个线程能正确的处理Instance变量
    private Singleton3(){

    }

    public static   Singleton3 getInstance(){
        if(Instance == null){
           synchronized(Singleton3.class){
               if(Instance == null){
                   Instance = new Singleton3();
               }
           }
        }
        return Instance;
    }
}
