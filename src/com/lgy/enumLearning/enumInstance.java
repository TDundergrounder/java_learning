package com.lgy.enumLearning;

public enum enumInstance{
    //创建名为INSTANCE的枚举实例
    INSTANCE;
    private Resource instance;
    //默认是私有化的构造函数，调用构造方法时将单例实例化
    enumInstance(){
        instance = new Resource();
    }
    //返回实例
    public Resource getInstance(){
        return instance;
    }

}

