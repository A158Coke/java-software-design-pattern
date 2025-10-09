package com.yuChen.design_pattern.patterns.factory;

import com.yuChen.design_pattern.patterns.factory.models.Americano;
import com.yuChen.design_pattern.patterns.factory.models.Coffee;

public interface CoffeeFactory {
    Coffee createCoffee();
}

