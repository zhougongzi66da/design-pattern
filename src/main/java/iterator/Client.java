package iterator;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  16:40
 */
public class Client {
    public static void main(String[] args) {
        //创建聚合对象
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        aggregate.addStudent(new Student("张三","001"));
        aggregate.addStudent(new Student("李四","002"));
        aggregate.addStudent(new Student("王五","003"));

        //遍历聚合对象
        //获取迭代器对象
        StudentIterator iterator = aggregate.getStudentIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
