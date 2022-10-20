package state.after;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  14:00
 */
public class Client {
    public static void main(String[] args) {
        //创建环境角色对象
        Context context=new Context();
        //设置当前电梯状态
        context.setLiftState(new OpeningState());
        context.close();
        context.open();
    }
}
