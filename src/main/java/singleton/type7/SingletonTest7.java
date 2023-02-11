package singleton.type7;


/**
 * @description: 单例模式-懒汉式（枚举）-测试类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  16:33
 */
public class SingletonTest7  {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
