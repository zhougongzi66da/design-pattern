package adaper.class_adapter;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  10:22
 */
public class TFCardImpl implements TFCard {
    public String readTF() {
        return "read TF";
    }

    public void writeTF(String msg) {
        System.out.println("write TF "+msg);
    }
}
