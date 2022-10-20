package state.after;

/**
 * @description: 环境角色类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  11:42
 */
public class Context {

    //定义对应状态对象对常量
    public final static OpeningState OPENING_STATE=new OpeningState();
    public final static StoppingState STOPPING_STATE=new StoppingState();
    public final static RunningState RUNNING_STATE=new RunningState();
    public final static ClosingState CLOSING_STATE=new ClosingState();

    //定义一个当前电梯状态变量
    private LiftState liftState;

    public LiftState getLiftState(){
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void run(){
        this.liftState.run();
    }

    public void close(){
        this.liftState.close();
    }

    public void stop(){
        this.liftState.stop();
    }
}
