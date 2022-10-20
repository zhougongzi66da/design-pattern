package state.after;

/**
 * @description: 电梯开启状态类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  11:44
 */
public class OpeningState extends LiftState{
    public void open() {
        System.out.println("电梯开启。。");
    }

    public void close() {
        context.setLiftState(Context.CLOSING_STATE);
        context.close();
    }

    public void run() {

    }

    public void stop() {

    }
}
