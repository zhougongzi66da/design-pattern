package singleton.test;

import java.lang.reflect.Constructor;

/**
 * @description: 测试反射破坏单例模式
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  10:03
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //1.获取字节码对象
        Class<Singleton> aClass = Singleton.class;
        //2.获取无参构造方法对象
        Constructor<Singleton> cons = aClass.getDeclaredConstructor();
        //3.取消访问检查
        cons.setAccessible(true);
        //4.创建对象
        Singleton singleton1 = cons.newInstance();
        Singleton singleton2 = cons.newInstance();

        System.out.println(singleton1 == singleton2);
    }
}
