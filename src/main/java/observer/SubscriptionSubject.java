package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  14:36
 */
public class SubscriptionSubject implements Subject{
    //定义一个集合，用来存储多个观察者对象
    private List<Observer> weiXinUserList=new ArrayList<Observer>();

    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    public void notify(String message) {
        for (Observer observer : weiXinUserList) {
            observer.update(message);
        }
    }
}
