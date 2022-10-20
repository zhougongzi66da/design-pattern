package responsibility;

/**
 * @description: 部门经理类（具体的处理者）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  17:10
 */
public class GroupManger extends Handler{

    public GroupManger(){
        super(NUM_ONE,NUM_THREE);
    }
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getNumber()+"天"+leave.getContent());
        System.out.println("部门经理审批：同意");
    }
}
