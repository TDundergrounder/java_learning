package com.lgy.enumLearning;

public enum enumInstance{
    //创建名为INSTANCE的枚举实例
    INSTANCE;
    //把类的构造函数写成私有化的
    private Resource instance;
    //调用构造方法时将单例实例化
    enumInstance(){
        instance = new Resource();
    }
    //返回实例
    public Resource getInstance(){
        return instance;
    }

}

