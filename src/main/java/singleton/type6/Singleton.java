package singleton.type6;

/**
 * @description: 单例模式-懒汉式（静态内部类）
 * 线程安全（JVM在类进行初始化的时候只允许一个线程进入）
 * 利用静态内部类的特点实现延迟加载（SingletonInstance只有在第一次使用时才会被初始化）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  16:18
 */
public class Singleton {
    private Singleton() {
    }

    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
