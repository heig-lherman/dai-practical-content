package ch.lutonite.heig.dai.iobenchmark.binary;

import ch.lutonite.heig.dai.iobenchmark.Writable;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Write a binary file byte by byte.
 */
public class BinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        try (var os = new FileOutputStream(filename)) {
            for (int i = 0; i < sizeInBytes; i++) {
                os.write(i);
            }
        }
    }
}
