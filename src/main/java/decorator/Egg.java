package decorator;

/**
 * @description: 鸡蛋类（具体的装饰者模式）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  11:38
 */
public class Egg extends Garnish{


    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    public float cost() {
        return getPrice()+getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
