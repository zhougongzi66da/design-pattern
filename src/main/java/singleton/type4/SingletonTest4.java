package singleton.type4;


/**
 * @description: 单例模式-懒汉式（synchronized保证线程安全）-测试类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  16:02
 */
public class SingletonTest4  {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
