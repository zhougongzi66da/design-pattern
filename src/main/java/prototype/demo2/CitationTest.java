package prototype.demo2;

import java.io.*;

/**
 * @description: 深克隆测试类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  15:22
 */
public class CitationTest {
    public static void main(String[] args) throws Exception {
        //1.创建原型对象
        Citation citation = new Citation();
        Student student=new Student();
        student.setName("张三");
        citation.setStu(student);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/prototype/demo2/a.txt"));
        oos.writeObject(citation);
        oos.close();

        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/prototype/demo2/a.txt"));
        Citation clone = (Citation)ois.readObject();
        ois.close();

        clone.getStu().setName("李四");

        citation.show();
        clone.show();
    }
}
