package interpreter;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  16:53
 */
public class Client {
    public static void main(String[] args) {
        Context context=new Context();

        Variable a=new Variable("a");
        Variable b=new Variable("b");
        Variable c=new Variable("c");
        Variable d=new Variable("d");

        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);

        //获取抽象语法树 (a-((b-c)+d))
        AbstractExpression expression = new Minus(a, new Plus(new Minus(b, c), d));

        //解释（计算）
        int res = expression.interpret(context);
        System.out.println(expression+"="+res);

    }
}
