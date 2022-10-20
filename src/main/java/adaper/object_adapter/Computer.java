package adaper.object_adapter;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  10:25
 */
public class Computer {

    public String readSD(SDCard sdCard){
        if (sdCard==null)
            throw new NullPointerException("sd card is null");
        return sdCard.readSD();
    }
}
