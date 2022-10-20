package decorator;

/**
 * @description: 炒饭（具体构件角色）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  11:33
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10,"炒饭");
    }

    public float cost() {
        return getPrice();
    }

}
