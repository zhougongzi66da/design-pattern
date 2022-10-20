package flyweight;

import java.util.HashMap;

/**
 * @description: 工厂类，将该类设计为单例
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  10:12
 */
public class BoxFactory {
    private HashMap<String,AbstractBox> map;

    private static volatile BoxFactory instance;

    private BoxFactory(){
        map=new HashMap<String, AbstractBox>();
        map.put("I",new IBox());
        map.put("O",new IBox());
    }
    public static BoxFactory getInstance(){
        if (instance==null){
            synchronized (BoxFactory.class){
                if(instance==null)
                    instance=new BoxFactory();
            }
        }
        return instance;
    }

    public AbstractBox getShape(String name){
        return map.get(name);
    }

}
