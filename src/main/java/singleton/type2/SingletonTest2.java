package singleton.type2;


/**
 * @description: 单例模式-饿汉式（静态代码块）-测试类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  15:52
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
