package proxy.static_proxy;

/**
 * @description: 火车站类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  17:13
 */
public class TrainStation implements SellTickets{
    public void sell() {
        System.out.println("火车站卖票");
    }
}
