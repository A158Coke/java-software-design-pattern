package com.yuChen.design_pattern.patterns.factory;

import com.yuChen.design_pattern.patterns.factory.models.Americano;
import com.yuChen.design_pattern.patterns.factory.models.Coffee;

public class AmericanoCoffeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}
