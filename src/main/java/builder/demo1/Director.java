package builder.demo1;

/**
 * @description: 指挥者类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  16:19
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder=builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}

