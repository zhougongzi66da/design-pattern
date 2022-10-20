package iterator;

/**
 * @description: 抽象迭代器角色接口
 * @Author: zhouyiming
 * @CreateTime: 2022-10-16  16:28
 */
public interface StudentIterator {
    //判断是否还有元素
    boolean hasNext();

    //获取下一个元素
    Student next();
}
