package memento.black_box;


/**
 * @description: 备忘录对象管理对象
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  16:06
 */
public class RoleStateCaretaker {

    //声明Memento类型的变量
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
