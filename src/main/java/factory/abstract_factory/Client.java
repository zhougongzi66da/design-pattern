package factory.abstract_factory;

import factory.static_factory.Coffee;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  14:22
 */
public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory factory=new ItalyDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert desert = factory.createDessert();
        coffee.getName();
        desert.show();
    }
}
