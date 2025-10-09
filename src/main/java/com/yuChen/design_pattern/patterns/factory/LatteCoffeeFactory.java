package com.yuChen.design_pattern.patterns.factory;

import com.yuChen.design_pattern.patterns.factory.models.Coffee;
import com.yuChen.design_pattern.patterns.factory.models.LatteCoffee;

public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
