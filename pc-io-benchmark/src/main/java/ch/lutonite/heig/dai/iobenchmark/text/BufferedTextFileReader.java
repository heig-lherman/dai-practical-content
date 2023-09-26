package ch.lutonite.heig.dai.iobenchmark.text;

import ch.lutonite.heig.dai.iobenchmark.Readable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Read a text file through buffers.
 */
public class BufferedTextFileReader implements Readable {

    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    @Override
    public void read(String filename) throws IOException {
        try (var is = new BufferedReader(new FileReader(filename, DEFAULT_CHARSET))) {
            int b; // is -1 if end of file or byte value 0-255
            while ((b = is.read()) != -1) {
                // do nothing
            }
        }
    }
}
