package factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @description:
 * @Author: zhouyiming
 * @CreateTime: 2022-10-13  14:36
 */
public class CoffeeFactory {

    //加载配置文件，获取配置文件中配置的全类名，并创建该类的对象进行存储
    //1、定义容器对象存储咖啡对象
    private static HashMap<String, Coffee> map = new HashMap<String, Coffee>();

    static {
        //1.创建Properties对象
        Properties p = new Properties();
        //2.配置文件加载
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                Class<?> clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //根据名称获取对象
    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}
