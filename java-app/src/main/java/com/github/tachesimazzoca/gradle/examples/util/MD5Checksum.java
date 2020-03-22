package com.github.tachesimazzoca.gradle.examples.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;
import java.io.InputStream;

public class MD5Checksum implements Checksum {
    public String checksum(InputStream in) throws IOException {
        return DigestUtils.md5Hex(in);
    }
}
