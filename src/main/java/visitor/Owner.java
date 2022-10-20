package visitor;

/**
 * @description: 具体访问者角色类（主人）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  15:19
 */
public class Owner implements Person{
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}
