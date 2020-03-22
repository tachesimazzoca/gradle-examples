package com.github.tachesimazzoca.gradle.examples.util;

public class SystemClock implements Clock {
    private final long offset;

    public SystemClock() {
        offset = 0L;
    }

    public SystemClock(long offset) {
        this.offset = offset;
    }

    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis() + offset;
    }
}
