package adaper.object_adapter;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  10:26
 */
public class Client {
    public static void main(String[] args) {
        Computer computer=new Computer();
        //读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("====================");
        //定义适配器类
        String s = computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(s);
    }
}
