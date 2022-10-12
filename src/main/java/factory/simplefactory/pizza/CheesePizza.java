package factory.simplefactory.pizza;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-12  17:18
 */
public class CheesePizza extends Pizza {
    public void prepare() {
        System.out.println("给制造奶酪披萨准备原材料");
    }
}
