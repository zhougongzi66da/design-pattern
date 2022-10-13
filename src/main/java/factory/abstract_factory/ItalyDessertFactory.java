package factory.abstract_factory;

import factory.static_factory.Coffee;
import factory.static_factory.LatterCoffee;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  14:21
 */
public class ItalyDessertFactory implements DessertFactory {
    public Coffee createCoffee() {
        return new LatterCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
