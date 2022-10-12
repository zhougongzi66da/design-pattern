package singleton.type3;

/**
 * @description: 单例模式-懒汉式（线程不安全）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  16:02
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
