package state.before;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  11:15
 */
public class Client {
    public static void main(String[] args) {
        //创建电梯对象
        Lift lift=new Lift();

        lift.setState(ILift.STOPPING_STATE);

        lift.open();
    }
}
