package adaper.object_adapter;

/**
 * @description: 适配器类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  10:28
 */
public class SDAdapterTF implements SDCard{
    private TFCard tfCard;
    SDAdapterTF(TFCard tfCard){
        this.tfCard=tfCard;
    }
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
