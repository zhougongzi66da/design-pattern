package factory.factory_method;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  11:15
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore=new CoffeeStore();
        coffeeStore.setFactory(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        coffee.getName();
    }
}
