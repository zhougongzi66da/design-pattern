package responsibility;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  17:15
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leave=new LeaveRequest("张三",12,"身体不适");

        GroupLeader leader=new GroupLeader();
        GroupManger manger=new GroupManger();
        GroupBoss boss=new GroupBoss();

        //设置处理者链
        leader.setNextHandler(manger);
        manger.setNextHandler(boss);

        //提交请假申请
        leader.submit(leave);
    }
}
