package proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 获取代理对象的工厂类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  17:33
 */
public class ProxyFactory {
    //声明目标对象
    private TrainStation station=new TrainStation();

    //返回代理对象
/*
    ClassLoader loader,类加载器，用于加载代理类。可以通过目标对象获取类加载器
    Class<?>[] interfaces,代理类实现的接口字节码对象
    InvocationHandler h 代理对象的调用处理程序
    */
    public SellTickets getProxyObject(){
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                /*
                 Object proxy,代理对象。和proxyObject对象是同一个对象，在invoke方法中基本不用
                 Method method,对接口中对方法进行封装对method对象
                 Object[] args，调用方法对实际参数
                 返回值：方法的返回值
                 **/
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理对象执行before（jdk动态代理）");
                        Object invoke = method.invoke(station, args);
                        System.out.println("after");
                        return invoke;
                    }
                }
        );
        return proxyObject;
    }
}
