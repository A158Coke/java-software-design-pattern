package com.yuChen.design_pattern.patterns.abstractFactory;

import com.yuChen.design_pattern.patterns.abstractFactory.models.Snacks;
import com.yuChen.design_pattern.patterns.factory.models.Americano;
import com.yuChen.design_pattern.patterns.factory.models.Coffee;

public class UsaFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }

    @Override
    public Snacks createSnacks() {
        return new Snacks();
    }
}
