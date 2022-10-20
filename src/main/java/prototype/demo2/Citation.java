package prototype.demo2;

import java.io.Serializable;

/**
 * @description: 奖状类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  15:20
 */
public class Citation implements Cloneable, Serializable {
    private Student stu;

    public void show() {
        System.out.println(stu.getName() + "获得奖状");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }
}
