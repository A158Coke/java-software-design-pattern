package com.yuChen.design_pattern.patterns.abstractFactory;

import com.yuChen.design_pattern.patterns.abstractFactory.models.Snacks;
import com.yuChen.design_pattern.patterns.factory.models.Coffee;
import com.yuChen.design_pattern.patterns.factory.models.LatteCoffee;

public class ChinaFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Snacks createSnacks() {
        return new Snacks();
    }
}
