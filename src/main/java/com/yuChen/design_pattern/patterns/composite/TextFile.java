package com.yuChen.design_pattern.patterns.composite;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TextFile extends AbstractFile {
    private final String name;

    @Override
    public void add(AbstractFile file) {

    }

    @Override
    public void remove(AbstractFile file) {

    }

    @Override
    public AbstractFile getChild(int index) {
        return null;
    }
}
