package singleton.type5;

/**
 * @description: 单例模式-懒汉式（DoubleCheck）-测试类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  16:11
 */
public class SingletonTest5  {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
