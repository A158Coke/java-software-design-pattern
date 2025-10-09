package com.yuChen.design_pattern.patterns.factory.models;

import java.sql.Timestamp;
import java.time.Instant;

public abstract class Coffee {
    protected String name;
    public String coffeName() {
        return this.name;
    }
}
