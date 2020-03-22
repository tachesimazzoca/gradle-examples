package com.github.tachesimazzoca.gradle.examples;

import com.github.tachesimazzoca.gradle.examples.util.Clock;
import com.github.tachesimazzoca.gradle.examples.util.SystemClock;

public class Main {
    public static void main(String[] args) {
        long offset = 0L;
        if (args.length > 0) {
            offset = Long.parseLong(args[0]);
        }
        Clock c = new SystemClock(offset);
        System.out.println(new java.util.Date(c.currentTimeMillis()));
    }
}
