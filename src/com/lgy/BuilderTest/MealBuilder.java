package com.lgy.BuilderTest;

public class MealBuilder {
    public Meal VegMeal(){
        //创建一个Meal的实例
        Meal meal = new Meal();
        //向Meal实例中添加素的item的实例
        meal.addItem(new VerBurger());
        meal.addItem(new Water());
        return meal;
    }

    public Meal NonVegMeal(){
        //创建一个Meal的实例
        Meal meal = new Meal();
        //向Meal实例中添加非素的item的实例
        meal.addItem(new ChickenBurger());
        meal.addItem((new Pepsi()));
        return NonVegMeal();
    }



}
