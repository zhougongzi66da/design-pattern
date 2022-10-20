package builder.demo2;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  16:44
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .builderCpu("intel")
                .builderScreen("sansam")
                .builderMainboard("a")
                .builderMemory("b").build();
        System.out.println(phone);
    }
}
