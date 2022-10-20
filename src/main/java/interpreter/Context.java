package interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 环境角色类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-20  16:44
 */
public class Context {

    //定义一个map集合，用来存储变量及对应的值
    private Map<Variable,Integer> map=new HashMap<Variable,Integer>();

    //添加变量的值
    public void assign(Variable var,Integer value){
        map.put(var,value);
    }

    public int getValue(Variable var){
        return map.get(var);
    }
}
