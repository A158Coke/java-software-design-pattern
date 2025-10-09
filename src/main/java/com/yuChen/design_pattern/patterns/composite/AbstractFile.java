package com.yuChen.design_pattern.patterns.composite;

import java.util.List;

public abstract class AbstractFile {
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int index);
}

