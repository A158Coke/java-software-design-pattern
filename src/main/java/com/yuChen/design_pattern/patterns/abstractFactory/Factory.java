package com.yuChen.design_pattern.patterns.abstractFactory;

import com.yuChen.design_pattern.patterns.abstractFactory.models.Snacks;
import com.yuChen.design_pattern.patterns.factory.models.Americano;
import com.yuChen.design_pattern.patterns.factory.models.Coffee;
import com.yuChen.design_pattern.patterns.factory.models.LatteCoffee;

public interface Factory {
    Coffee createCoffee();
    Snacks createSnacks();
}

