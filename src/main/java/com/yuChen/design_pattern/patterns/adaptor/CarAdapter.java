package com.yuChen.design_pattern.patterns.adaptor;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CarAdapter implements CarController {
    private final PoliceSound sound;
    private final PoliceShine shine;

    @Override
    public void sound() {
        this.sound.sound();
    }
    @Override
    public void shine() {
        this.shine.shine();
    }
}
