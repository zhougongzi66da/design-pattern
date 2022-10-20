package flyweight;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  10:21
 */
public class Client {
    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");

        AbstractBox box2 = BoxFactory.getInstance().getShape("I");
        box2.display("红色");

        System.out.println(box1==box2);
    }
}
