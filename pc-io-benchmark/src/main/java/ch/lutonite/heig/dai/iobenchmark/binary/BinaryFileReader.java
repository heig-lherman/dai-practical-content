package ch.lutonite.heig.dai.iobenchmark.binary;

import ch.lutonite.heig.dai.iobenchmark.Readable;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Read a binary file byte by byte to the console.
 */
public class BinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        try (var is = new FileInputStream(filename)) {
            int b; // is -1 if end of file or byte value 0-255
            while ((b = is.read()) != -1) {
                // do nothing
            }
        }
    }
}
