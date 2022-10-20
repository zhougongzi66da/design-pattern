package prototype.demo1;

/**
 * @description: 奖状类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  15:20
 */
public class Citation implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name+"获得奖状");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
