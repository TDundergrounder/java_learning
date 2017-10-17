package com.lgy.BuilderTest;

public class Water extends ColdDrink {
    @Override
    public String name() {
        return "Water";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
