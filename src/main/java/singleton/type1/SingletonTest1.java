package singleton.type1;

/**
 * @description: 单例模式-饿汉式（静态变量）-测试类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  15:46
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
