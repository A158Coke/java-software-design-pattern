package com.yuChen.design_pattern.patterns.flyweight;

public abstract class Chessman {
    public abstract String getColor();
    public void display() {
        System.out.println("color：" + getColor());
    }
}

