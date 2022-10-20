package decorator;

/**
 * @description: 培根类（具体的装饰者模式）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  11:38
 */
public class Bacon extends Garnish{


    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    public float cost() {
        return getPrice()+getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
