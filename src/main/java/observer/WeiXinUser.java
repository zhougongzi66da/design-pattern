package observer;

/**
 * @description: 具体对观察者角色类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  14:39
 */
public class WeiXinUser implements Observer {

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name+"-"+message);
    }
}
