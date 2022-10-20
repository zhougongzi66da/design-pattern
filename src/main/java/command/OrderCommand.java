package command;

import java.util.Map;
import java.util.Set;

/**
 * @description: 具体的命令类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  14:49
 */
public class OrderCommand implements Command{
    //持有接收者对象
    private SeniorChief receiver;
    private Order order;

    public OrderCommand(SeniorChief receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    public void execute() {
        System.out.println(order.getDiningTable()+"桌的订单");
        Map<String, Integer> foodDir = order.getFoodDir();
        //遍历map集合
        Set<String> keys = foodDir.keySet();
        for(String key:keys){
            receiver.makeFood(key,foodDir.get(key));
        }
        System.out.println(order.getDiningTable()+"桌的订单准备完毕");
    }
}
