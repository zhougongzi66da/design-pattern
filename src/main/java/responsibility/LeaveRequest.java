package responsibility;

/**
 * @description: 请假条类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  17:00
 */
public class LeaveRequest {
    private String name;

    private int number;

    private String content;

    public LeaveRequest(String name, int number, String content) {
        this.name = name;
        this.number = number;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getContent() {
        return content;
    }
}
