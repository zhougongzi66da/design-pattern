package observer;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  14:41
 */
public class Client {
    public static void main(String[] args) {
        //1.创建公众号对象
        SubscriptionSubject subject=new SubscriptionSubject();

        //2.订阅公众号
        subject.attach(new WeiXinUser("小明"));
        subject.attach(new WeiXinUser("小红"));
        subject.attach(new WeiXinUser("小刚"));

        //公众号更新，发出消息给订阅者
        subject.notify("更新了");
    }
}
