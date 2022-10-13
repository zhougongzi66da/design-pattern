package singleton.type7;

/**
 * @description: 单例模式-懒汉式（枚举）
 * 不仅可以避免多线程同步问题，而且可以防止反序列化和反射重新创建新的对象
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  16:33
 */
public enum Singleton {
    INSTANCE;

    public void sayHello() {
        System.out.println("hello");
    }
}
