package com.yuChen.design_pattern.patterns.decorator;

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        setBlackBorder();
    }

    private void setBlackBorder() {
        System.out.println("Set Black Border");
    }
}
