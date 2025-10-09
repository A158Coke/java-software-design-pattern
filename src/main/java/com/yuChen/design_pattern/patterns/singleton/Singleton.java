package com.yuChen.design_pattern.patterns.singleton;

public class Singleton {
    private static final Singleton instance = new Singleton();
    private static Singleton getInstance(){
        return instance;
    }
}
