package responsibility;

/**
 * @description: 抽象处理者类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  17:01
 */
public abstract class Handler {
    protected final static int NUM_ONE=1;
    protected final static int NUM_THREE=3;
    protected final static int NUM_SEVEN=7;

    //该领导处理的请求天数区间
    private int numberStart;
    private int numEnd;

    //声明后继者（声明上级领导）
    private Handler nextHandler;

    public Handler(int numberStart) {
        this.numberStart = numberStart;
    }

    public Handler(int numberStart, int numEnd) {
        this.numberStart = numberStart;
        this.numEnd = numEnd;
    }
    //设置上级领导对象
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //各级领导处理请假条的方法
    protected abstract void handlerLeave(LeaveRequest leave);

    //提交请假条
    public final void submit (LeaveRequest leave){
        //该领导先进行审批
        this.handlerLeave(leave);
        if(this.nextHandler!=null&&leave.getNumber()>this.numEnd){
            //提交给上级领导进行审批
            this.nextHandler.submit(leave);
        }else
            System.out.println("流程结束！");
    }
}
