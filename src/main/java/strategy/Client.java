package strategy;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  14:11
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan=new SalesMan(new StrategyA());
        salesMan.salesManShow();
        System.out.println("+++++++++");
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();
    }
}
