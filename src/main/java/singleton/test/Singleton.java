package singleton.test;

import java.io.Serializable;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  09:45
 */
public class Singleton implements Serializable {

    private static boolean flag=false;

    //防止反射破坏单例模式
    private Singleton() {
        synchronized (Singleton.class){
            if (flag)
                throw new RuntimeException("不能创建多个对象");
            flag=true;
        }
    }

    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    //当进行反序列化时，会自动调用该方法，将该方法返回值直接返回
    public Object readResolve(){
        return SingletonInstance.INSTANCE;
    }
}

