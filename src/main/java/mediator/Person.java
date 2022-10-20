package mediator;

/**
 * @description: 抽象同事类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  15:21
 */
public class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
