package visitor;

/**
 * @description: 具体访问者角色类（其他人）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  15:19
 */
public class Someone implements Person{
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}
