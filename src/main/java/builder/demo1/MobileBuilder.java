package builder.demo1;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  16:15
 */
public class MobileBuilder extends Builder{
    public void buildFrame() {
        bike.setFrame("碳纤维");
    }

    public void buildSeat() {
        bike.setSeat("真皮");
    }

    public Bike createBike() {
        return bike;
    }
}
