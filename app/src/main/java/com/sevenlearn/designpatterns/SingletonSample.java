package com.sevenlearn.designpatterns;

/**
 * Created by user on 2/18/2018.
 */

public class SingletonSample {
    private static SingletonSample instance;

    public static SingletonSample getInstance() {
        if (instance == null) {
            instance = new SingletonSample();
        }
        return instance;
    }

    private SingletonSample(){

    }

    public static void doSomething(){
        //do something
    }
}
