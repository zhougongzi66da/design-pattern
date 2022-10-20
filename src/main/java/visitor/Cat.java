package visitor;

/**
 * @description: 具体元素角色类（宠物猫）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  15:17
 */
public class Cat implements Animal{

    public void accept(Person person) {
        person.feed(this);
        System.out.println("喵喵喵");
    }
}
