package bridge;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  16:00
 */
public class Client {
    public static void main(String[] args) {
        //创建mac系统对象
        OperatingSystem system=new Mac(new AviFile());
        system.play("哈哈哈");
    }
}
