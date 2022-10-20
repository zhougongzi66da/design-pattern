package factory.config_factory;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  11:05
 */
public abstract class Coffee {

    public abstract void getName();

    public void addMilk() {
        System.out.println("加奶");
    }

    public void addSuger() {
        System.out.println("加糖");
    }
}
