package com.lgy.test;

public class lombokTest1 {
    //创建一个实体，调用lombok类里的set，get方法
    public static void main(String[] args) {
        lombokTest ltest = new lombokTest();
        ltest.setAge(10);
        ltest.getAge();
        ltest.setName("lianggy");
        ltest.getName();
        ltest.setScore(10.05);
        ltest.getScore();
    }
}
