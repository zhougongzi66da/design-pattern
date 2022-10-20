package builder.demo1;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  16:18
 */
public class OfoBuilder extends Builder{
    public void buildFrame() {
        bike.setFrame("铝合金");
    }

    public void buildSeat() {
        bike.setSeat("布料");
    }

    public Bike createBike() {
        return bike;
    }
}
