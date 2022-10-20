package state.after;

/**
 * @description: 电梯开启状态类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  11:44
 */
public class ClosingState extends LiftState{
    public void open() {
        System.out.println("电梯开启。。");
        context.setLiftState(Context.CLOSING_STATE);

    }

    public void close() {
        System.out.println("电梯关闭。。");
    }

    public void run() {

    }

    public void stop() {

    }
}
