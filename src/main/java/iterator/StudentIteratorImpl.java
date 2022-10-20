package iterator;

import java.util.List;

/**
 * @description: 具体迭代器角色类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  16:29
 */
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    //用来记录遍历时的位置
    private int position = 0;
    public boolean hasNext() {
        return position<list.size();
    }

    public Student next() {
        //从集合中获取指定位置的元素
        Student student = list.get(position);
        position++;
        return student;
    }
}
