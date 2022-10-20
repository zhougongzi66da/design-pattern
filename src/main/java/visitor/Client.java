package visitor;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  15:24
 */
public class Client {
    public static void main(String[] args) {
        Home home=new Home();
        home.add(new Cat());
        home.add(new Dog());
        home.action(new Owner());
        home.action(new Someone());
    }
}
