package com.github.tachesimazzoca.gradle.examples.util;

import java.io.IOException;
import java.io.InputStream;

public interface Checksum {
    String checksum(InputStream in) throws IOException;
}
