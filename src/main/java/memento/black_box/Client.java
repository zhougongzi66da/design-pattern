package memento.black_box;


/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  16:07
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("---------------大战前---------------");
        GameRole gameRole = new GameRole();
        gameRole.initState();//初始化状态操作
        gameRole.stateDisplay();

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());


        System.out.println("---------------大战后---------------");
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("---------------恢复状态--------------");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();
    }
}
