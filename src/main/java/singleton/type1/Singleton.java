package singleton.type1;

/**
 * @description: 单例模式-饿汉式（静态变量）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  15:47
 */
public class Singleton {
    private Singleton() {
    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
