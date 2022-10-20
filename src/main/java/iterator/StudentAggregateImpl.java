package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  16:38
 */
public class StudentAggregateImpl implements StudentAggregate {
    private List<Student> list=new ArrayList<Student>();

    public void addStudent(Student stu) {
        list.add(stu);
    }

    public void removeStudent(Student stu) {
        list.remove(stu);
    }

    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
