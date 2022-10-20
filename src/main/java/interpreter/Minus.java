package interpreter;

/**
 * @description: 加法表达式类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  16:46
 */
public class Minus extends AbstractExpression{

    //-号左边的表达式
    private AbstractExpression left;

    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret(Context context) {
        return left.interpret(context)-right.interpret(context);
    }

    @Override
    public String toString() {
        return "("+left.toString()+"-"+right.toString()+")";
    }
}
