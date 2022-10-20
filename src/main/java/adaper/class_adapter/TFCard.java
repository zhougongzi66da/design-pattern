package adaper.class_adapter;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  10:20
 */
public interface TFCard {
    String readTF();

    void writeTF(String msg);
}
