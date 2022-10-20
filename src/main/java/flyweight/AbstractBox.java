package flyweight;

/**
 * @description: 抽象享元角色
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  10:08
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color){
        System.out.println("方块形状： "+getShape()+"    颜色： "+color);
    }
}
