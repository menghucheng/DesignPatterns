package com.mhc.singleton;

/**
 * Created by mhc on 15-6-20.
 */
public class Singleton2 {
     private static Singleton2 Instance=null;
    //如果需要一开始就创建而不是需要时再创建，可以直接在上面new
    private Singleton2(){

    }

    public synchronized static Singleton2 getInstance(){//多线程的话可以考虑加锁这个函数，保证每个线程进入该方法之前都必须保证其他线程离开该方法
        if(Instance == null){
            Instance = new Singleton2();
        }
        return Instance;
    }

    //但是这个写法有点不好，就是只有第一次执行该方法的时候才真正需要同步。其他石猴每次调用这个方法就成为了累赘
}
