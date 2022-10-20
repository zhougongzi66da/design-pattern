package adaper.class_adapter;

/**
 * @description: 适配器类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  10:28
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
