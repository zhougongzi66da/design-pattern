package interpreter;

/**
 * @description: 抽象表达式类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  16:42
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}
