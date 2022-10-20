package mediator;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  15:29
 */
public class Client {
    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediator=new MediatorStructure();

        //创建租房者对象
        Tenant tenant = new Tenant("李四",mediator);

        //创建房主对象
        HouseOwner houseOwner = new HouseOwner("张三", mediator);

        //中介者要知道具体的房主和租房者
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        tenant.contact("我要租房");
        houseOwner.contact("我有房子");


    }
}
