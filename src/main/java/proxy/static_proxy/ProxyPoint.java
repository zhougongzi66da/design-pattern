package proxy.static_proxy;

/**
 * @description: 代售点类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  17:15
 */
public class ProxyPoint implements SellTickets{
    private TrainStation trainStation=new TrainStation();

    public void sell() {
        System.out.println("中间商赚差价");
        trainStation.sell();
    }
}
