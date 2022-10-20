package factory.factory_method;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  11:33
 */
public class LatterCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new LatterCoffee();
    }
}
