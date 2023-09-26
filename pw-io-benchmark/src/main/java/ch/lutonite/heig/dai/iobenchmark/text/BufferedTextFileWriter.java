package ch.lutonite.heig.dai.iobenchmark.text;

import ch.lutonite.heig.dai.iobenchmark.Writable;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Write a text file through buffers.
 */
public class BufferedTextFileWriter implements Writable {

    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        try (var os = new BufferedWriter(new FileWriter(filename, DEFAULT_CHARSET))) {
            for (int i = 0; i < sizeInBytes; i++) {
                os.write(i);
            }
        }
    }
}
