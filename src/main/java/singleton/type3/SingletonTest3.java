package singleton.type3;


/**
 * @description: 单例模式-饿汉式（线程不安全）-测试类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  16:07
 */
public class SingletonTest3  {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
