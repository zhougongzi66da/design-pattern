package state.after;

/**
 * @description: 电梯开启状态类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  11:44
 */
public class RunningState extends LiftState{
    public void open() {

    }

    public void close() {

    }

    public void run() {
        System.out.println("电梯正在运行");
    }

    public void stop() {
        context.setLiftState(Context.STOPPING_STATE);
        context.stop();
    }
}
