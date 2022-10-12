package singleton.type4;

/**
 * @description: 单例模式-懒汉式（synchronized保证线程安全）
 * 效率低
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  16:07
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
