package interpreter;

/**
 * @description: 封装变量的类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  16:44
 */
public class Variable extends AbstractExpression{

    //声明存储变量名
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public int interpret(Context context) {
        //直接返回变量的值
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
