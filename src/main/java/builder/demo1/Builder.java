package builder.demo1;

/**
 * @description: 抽象建造者
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  16:12
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();


}
