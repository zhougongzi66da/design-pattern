package iterator;

/**
 * @description: 抽象聚合角色接口
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  16:36
 */
public interface StudentAggregate {

    //添加学生功能
    void addStudent(Student stu);

    //删除学生功能
    void removeStudent(Student stu);

    //获取迭代器对象功能
    StudentIterator getStudentIterator();
}
