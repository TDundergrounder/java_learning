package com.lgy.BuilderTest;

public class BuilderDemo {
    //BuilderDemo类使用MealBuilder来演示构造器模式
    public static void main(String[] args) {
        //创建一个MealBuilder的实例
        MealBuilder mealBuilder = new MealBuilder();
        //创建一个对象，返回值为素食的
        Meal vegMeal = mealBuilder.VegMeal();
        System.out.println("Veg Meal");
        //打印出素食下的所有item
        vegMeal.showItems();
        System.out.println("Total Cost:"+vegMeal.getCost());

        //同理来打印出所有的肉食
        Meal nonVegMeal = mealBuilder.NonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
