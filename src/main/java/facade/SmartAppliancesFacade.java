package facade;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  16:17
 */
public class SmartAppliancesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade(){
        light=new Light();
        tv=new TV();
        airCondition=new AirCondition();
    }

    public void say(String message){
        if (message.contains("打开")){
            on();
        }else if(message.contains("关闭")){
            off();
        }else{
            System.out.println("听不懂");
        }
    }

    private void on(){
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off(){
        light.off();
        tv.off();
        airCondition.off();
    }
}
