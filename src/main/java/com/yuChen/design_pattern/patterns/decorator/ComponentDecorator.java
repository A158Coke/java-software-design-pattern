package com.yuChen.design_pattern.patterns.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ComponentDecorator extends Component {
    private final Component component;
    @Override
    public void display() {
        component.display();
    }
}

