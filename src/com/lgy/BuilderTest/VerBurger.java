package com.lgy.BuilderTest;

public class VerBurger extends Burger {
    @Override
    public String name() {
        return "VerBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
