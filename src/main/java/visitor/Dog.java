package visitor;

/**
 * @description: 具体元素角色类（宠物狗）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  15:17
 */
public class Dog implements Animal{

    public void accept(Person person) {
        person.feed(this);
        System.out.println("汪汪汪");
    }
}
