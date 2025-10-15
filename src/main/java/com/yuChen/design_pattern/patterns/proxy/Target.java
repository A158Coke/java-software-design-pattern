package com.yuChen.design_pattern.patterns.proxy;


public class Target {
    public void doSomething() {
        System.out.println("doSomething");
    }
}
class Proxy extends Target {
    @Override
    public void doSomething() {
        System.out.println("before");
        super.doSomething();
        System.out.println("after");
    }
}
