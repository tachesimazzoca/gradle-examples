package com.github.tachesimazzoca.gradle.examples.util;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class MD5ChecksumTest {
    @Test
    public void testChecksum() throws Exception {
        Checksum cs = new MD5Checksum();
        String body = "This is a test message.\n";
        InputStream in = new ByteArrayInputStream(body.getBytes());
        assertEquals("ded9c80d74465ab65a9d438a77f8588c", cs.checksum(in));
    }
}
