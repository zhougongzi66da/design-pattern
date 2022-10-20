package decorator;

/**
 * @description: 炒面（具体的构件角色）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  11:35
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(20,"炒面");
    }

    public float cost() {
        return getPrice()   ;
    }
}
