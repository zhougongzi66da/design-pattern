package adaper.class_adapter;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  10:23
 */
public class SDCardImpl implements SDCard {
    public String readSD() {
        return "read SD";
    }

    public void writeSD(String msg) {
        System.out.println("write SD "+msg);
    }
}
