package factory.abstract_factory;

import factory.static_factory.Coffee;

/**
 * @description: 抽象工厂
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  14:18
 */
public interface DessertFactory {
    Coffee createCoffee();

    Dessert createDessert();
}
