package strategy;

/**
 * @description: 具体策略类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  14:05
 */
public class StrategyA implements Strategy{
    public void show() {
        System.out.println("买一送一");
    }
}
