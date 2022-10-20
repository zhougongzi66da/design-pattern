package factory.config_factory;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  14:47
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        coffee.getName();
    }
}
