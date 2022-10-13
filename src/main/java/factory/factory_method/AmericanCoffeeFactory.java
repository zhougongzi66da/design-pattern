package factory.factory_method;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  11:32
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
