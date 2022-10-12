package singleton.type2;

/**
 * @description: 单例模式-饿汉式（静态代码块）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  15:52
 */
public class Singleton {
    private Singleton() {
    }

    private static final Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
