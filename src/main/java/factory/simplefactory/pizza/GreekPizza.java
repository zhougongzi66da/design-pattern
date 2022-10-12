package factory.simplefactory.pizza;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  17:19
 */
public class GreekPizza extends Pizza {
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
