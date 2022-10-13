package singleton.type7.type5;

/**
 * @description: 单例模式-懒汉式（DoubleCheck）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  16:11
 */
public class Singleton {
    private Singleton() {
    }

    private static volatile Singleton instance;


    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
