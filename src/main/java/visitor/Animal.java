package visitor;

/**
 * @description: 抽象元素角色类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  15:16
 */
public interface Animal {

    //接受访问者访问的功能
    void accept(Person person);
}
