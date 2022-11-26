package observer;

import javafx.beans.binding.ObjectExpression;

/**
 * @description: 抽象主题角色类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  14:32
 */
public interface Subject {

    //添加订阅者（添加观察者对象）
    void attach(Observer observer);

    //移除订阅者
    void detach(Observer observer);

    //通知订阅者更新消息
    void notify(String message);


}
