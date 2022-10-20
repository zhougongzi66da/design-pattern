package builder.demo1;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  16:21
 */
public class Client {
    public static void main(String[] args) {
        Director director=new Director(new MobileBuilder());
        Bike bike = director.construct();
        System.out.println(bike.getFrame()+" "+bike.getSeat());
    }
}
