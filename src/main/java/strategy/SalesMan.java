package strategy;

/**
 * @description: 促销员（环境类）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  14:09
 */
public class SalesMan {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //由促销员展示促销活动给用户
    public void salesManShow(){
        strategy.show();
    }
}
