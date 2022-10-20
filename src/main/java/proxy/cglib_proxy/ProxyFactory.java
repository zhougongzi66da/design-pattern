package proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.jdk_proxy.TrainStation;

import java.lang.reflect.Method;

/**
 * @description: 代理对象工厂
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  09:37
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject(){
        //创建Enhancer对象，类似于JDK代理中的Proxy类
        Enhancer enhancer=new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject  = (TrainStation)enhancer.create();
        return proxyObject;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object invoke = method.invoke(trainStation, objects);
        System.out.println("after");
        return invoke;
    }
}
