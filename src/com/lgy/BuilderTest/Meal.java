package com.lgy.BuilderTest;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    //创建一个用于存放所有科目的集合
    private List<Item> items = new ArrayList<Item>();
    //向集合中添加item
    public void addItem(Item item){
        items.add(item);
    }
    //获取所有item的价格,并返回
    public float getCost(){
        float cost = 0.0f;
        for(Item item:items){
            cost += item.price();
        }
        return cost;
    }
    //打印展示出所有的item名称，包装和价格
    public void showItems(){
        for(Item item:items){
            System.out.println("Item:"+ item.name());
            System.out.println(",Packing:"+item.packing().pack());
            System.out.println(",Price:"+item.price());
        }
    }

}
