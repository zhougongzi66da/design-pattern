package proxy.jdk_proxy;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  17:38
 */
public class Client {
    public static void main(String[] args) {
        //1、创建代理工厂对象
        ProxyFactory factory=new ProxyFactory();
        //2、使用factory对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject.getClass());
    }
}
