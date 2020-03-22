package com.github.tachesimazzoca.gradle.examples;

import com.github.tachesimazzoca.gradle.examples.util.Checksum;
import com.github.tachesimazzoca.gradle.examples.util.MD5Checksum;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream(new File(args[0]));
            Checksum cs = new MD5Checksum();
            System.out.println(cs.checksum(in));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
