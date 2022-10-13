package factory.static_factory;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  11:15
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore=new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latter");
        String a=null;
        coffee.getName();
    }
}
