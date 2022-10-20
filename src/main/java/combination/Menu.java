package combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 菜单类：属于树枝节点
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  09:31
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponentList=new ArrayList<MenuComponent>();

    public Menu(String name,int level){
        this.name=name;
        this.level=level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
       menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    public void print() {
        //打印菜单名称
        for (int i=0;i<level;i++){
            System.out.print("--");
        }
        System.out.println(name);
        //打印子菜单或者子菜单项名称
        for (MenuComponent component:menuComponentList){
            component.print();
        }
    }
}
