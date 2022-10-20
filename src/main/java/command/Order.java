package command;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 订单类
 * @Author: zhouyiming
 * @CreateTime: 2022-10-15  14:44
 */
public class Order {
    //餐桌号码
    private int diningTable;

    //所下餐品及份数
    private Map<String,Integer> foodDir=new HashMap<String, Integer>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name,int num) {
        foodDir.put(name,num);
    }
}
