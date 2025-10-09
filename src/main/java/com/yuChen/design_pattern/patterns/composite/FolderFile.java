package com.yuChen.design_pattern.patterns.composite;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class FolderFile extends AbstractFile {
    private final List<AbstractFile> fileList;
    private final String name;

    @Override
    public void add(final AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(final AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(final int index) {
        return fileList.get(index);
    }
}

