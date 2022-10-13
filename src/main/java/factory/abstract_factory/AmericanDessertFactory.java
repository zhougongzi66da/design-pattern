package factory.abstract_factory;

import factory.static_factory.AmericanCoffee;
import factory.static_factory.Coffee;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  14:20
 */
public class AmericanDessertFactory implements DessertFactory {
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new Trimisu();
    }
}
