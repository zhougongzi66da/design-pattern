package prototype.demo1;

/**
 * @description: 原型模式，浅克隆测试类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  15:22
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1.创建原型对象
        Citation citation = new Citation();

        //2.克隆奖状对象
        Citation clone = citation.clone();

        citation.setName("a");
        clone.setName("b");

        citation.show();
        clone.show();
    }
}
