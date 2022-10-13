package factory.factory_method;

/**
 * @description: 咖啡商店类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  11:13
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}
