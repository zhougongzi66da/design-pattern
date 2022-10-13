package singleton.test;


import java.io.*;

/**
 * @description: 测试使用反序列化方式破坏单例模式
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  09:45
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        writeObjectToFile();
        readObjectToFile();
        readObjectToFile();
    }

    //向文件中写数据
    public static void readObjectToFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/singleton/test/a.txt"));
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        ois.close();
    }
    //向文件中写数据
    public static void writeObjectToFile() throws IOException {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/singleton/test/a.txt"));
        oos.writeObject(instance);
        oos.close();
    }
}
