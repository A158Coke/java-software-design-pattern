package com.yuChen.design_pattern.patterns.singleton;

import lombok.Getter;

public class Singleton {
    @Getter
    private static final Singleton instance = new Singleton();

    private Singleton(){}
}
