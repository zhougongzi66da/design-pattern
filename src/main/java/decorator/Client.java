package decorator;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-14  11:43
 */
public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc()+" "+food.cost());

        System.out.println("==============");

        //在炒面中加鸡蛋
        food=new Egg(food);
        System.out.println(food.getDesc()+" "+food.cost());

        //再加一个鸡蛋
        food=new Egg(food);
        System.out.println(food.getDesc()+" "+food.cost());

    }
}
