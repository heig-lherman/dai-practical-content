package ch.lutonite.heig.dai.iobenchmark;

import java.io.IOException;

/**
 * Generic implementation of a method that can read a file.
 */
public interface Readable {

    void read(String filename) throws IOException;
}
