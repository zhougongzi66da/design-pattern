package responsibility;

/**
 * @description: 小组长类（具体的处理者）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  17:10
 */
public class GroupLeader extends Handler{

    public GroupLeader(){
        super(0,NUM_ONE);
    }
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getNumber()+"天"+leave.getContent());
        System.out.println("小组长审批：同意");
    }
}
