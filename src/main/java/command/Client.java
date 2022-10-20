package command;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  14:58
 */
public class Client {
    public static void main(String[] args) {
        //创建第一个订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("面条",1);
        order1.setFood("可乐",2);

        //创建第一个订单对象
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("面",1);
        order2.setFood("可",2);

        //创建厨师对象
        SeniorChief receiver=new SeniorChief();

        //创建命令对象
        OrderCommand cmd1=new OrderCommand(receiver,order1);
        OrderCommand cmd2=new OrderCommand(receiver,order2);

        //创建调用者
        Waiter invoke=new Waiter();
        invoke.setCommand(cmd1);
        invoke.setCommand(cmd2);
        invoke.orderUp();


    }
}
