package template;

/**
 * @description: 抽象类（定义模版方法和基本方法）
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  10:58
 */
public abstract class AbstractClass {
    //模版方法定义
    public final void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pourOil(){
        System.out.println("倒油");
    }

    public void heatOil(){
        System.out.println("热油");
    }

    public abstract void pourSauce();

    public abstract void pourVegetable();

    public void fry(){
        System.out.println("炒啊炒");
    }
}
