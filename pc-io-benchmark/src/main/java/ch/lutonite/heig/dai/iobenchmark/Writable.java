package ch.lutonite.heig.dai.iobenchmark;

import java.io.IOException;

/**
 * Generic implementation of a method that can write a file of a given size.
 */
public interface Writable {

    void write(String filename, int size) throws IOException;
}
