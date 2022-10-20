package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 服务员类（属于请求者对象）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  14:54
 */
public class Waiter {
    //持有多个命令对象
    private List<Command>commands=new ArrayList<Command>();

    public void setCommand(Command cmd){
        commands.add(cmd);
    }

    //发起命令功能
    public void orderUp(){
        System.out.println("服务员对大厨说订单来了");
        for (Command command:commands){
            if (command!=null){
                command.execute();
            }
        }
    }
}
