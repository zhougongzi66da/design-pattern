package prototype.demo2;

import java.io.Serializable;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  15:26
 */
public class Student implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
