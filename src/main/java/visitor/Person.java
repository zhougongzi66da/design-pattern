package visitor;

/**
 * @description: 抽象访问者角色类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  15:14
 */
public interface Person {

    void feed(Cat cat);

    void feed(Dog dog);
}
