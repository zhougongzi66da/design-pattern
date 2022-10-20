package memento.white_box;

/**
 * @description: 备忘录对象管理对象
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  16:06
 */
public class RoleStateCaretaker {

    //声明RoleStateMemento类型的变量
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
