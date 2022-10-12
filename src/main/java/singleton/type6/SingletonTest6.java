package singleton.type6;


/**
 * @description: 单例模式-懒汉式（静态内部类）-测试类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  16:18
 */
public class SingletonTest6  {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
