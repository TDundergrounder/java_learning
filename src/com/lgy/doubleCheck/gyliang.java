package com.lgy.doubleCheck;

//    public class gyliang{
//        private gyliang(){
//        };
//        private static final gyliang test = new gyliang();
//        public static guliang getInstance(){
//            return test;
//        }
//    }

//    //懒汉式，多线程状态下会出现无法实现单例的bug
//    public class gyliang{
//        private gyliang(){
//
//        };
//        private static gyliang g = null;
//        public static gyliang getInstance(){
//            if(g == null){
//                gyliang g = new gyliang();
//            }
//            return g;
//        }
//    }

    //加上同步锁
    public class gyliang{
        private static gyliang g = null;

        public static gyliang getInstance(){
            if(g == null){
                synchronized(gyliang.class){
                    if(g == null){
                        gyliang g = new gyliang();
                    }
                }
            }
            return g;
        }
        private gyliang(){

        };
    }

