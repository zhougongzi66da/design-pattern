package state.before;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  11:09
 */
public class Lift implements ILift {

    //记录当前的状态

    private int state;

    public void setState(int state) {
        this.state = state;
    }

    public void open() {
        switch (state) {
            case OPENING_STATE:
                //什么事都不做
                break;
            case CLOSING_STATE:
                System.out.println("电梯打开了。。。");
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了。。。");
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;

        }
    }

    public void close() {

    }

    public void run() {

    }

    public void stop() {

    }
}
