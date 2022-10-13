package factory.simple_factory;

/**
 * @description: 咖啡工厂类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  11:09
 */
public class CoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type))
            coffee = new AmericanCoffee();
        else if ("latter".equals(type))
            coffee = new LatterCoffee();
        else throw new RuntimeException("没有此咖啡");
        return coffee;
    }
}
