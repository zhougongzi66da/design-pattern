package factory.simple_factory;

/**
 * @description: 咖啡商店类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  11:13
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}
