package responsibility;

/**
 * @description: 老板类（具体的处理者）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  17:10
 */
public class GroupBoss extends Handler{

    public GroupBoss(){
        super(NUM_THREE,NUM_SEVEN);
    }
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getNumber()+"天"+leave.getContent());
        System.out.println("老板审批：同意");
    }
}
