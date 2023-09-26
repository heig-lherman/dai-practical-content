package ch.lutonite.heig.dai.iobenchmark;

import ch.lutonite.heig.dai.iobenchmark.Measure.FileType;
import lombok.extern.slf4j.Slf4j;

/**
 * Main class for this practical work.
 *
 * @author Loïc Herman
 */
@Slf4j
public class Main {

    /**
     * Main method.
     *
     * @param args the command line arguments
     * @throws Exception if an error occurs
     */
    public static void main(String[] args) throws Exception {
        // Test on binary

        Measure.write("target/binary_1B.bin", 1, false, FileType.BINARY);
        Measure.read("target/binary_1B.bin", false, FileType.BINARY);

        Measure.write("target/binary_1KB.bin", 1024, false, FileType.BINARY);
        Measure.read("target/binary_1KB.bin", false, FileType.BINARY);

        Measure.write("target/binary_1MB.bin", 1024 * 1024, false, FileType.BINARY);
        Measure.read("target/binary_1MB.bin", false, FileType.BINARY);

        Measure.write("target/binary_5MB.bin", 5 * 1024 * 1024, false, FileType.BINARY);
        Measure.read("target/binary_5MB.bin", false, FileType.BINARY);

        // Test on buffered binary

        Measure.write("target/buffered_binary_1B.bin", 1, true, FileType.BINARY);
        Measure.read("target/buffered_binary_1B.bin", true, FileType.BINARY);

        Measure.write("target/buffered_binary_1KB.bin", 1024, true, FileType.BINARY);
        Measure.read("target/buffered_binary_1KB.bin", true, FileType.BINARY);

        Measure.write("target/buffered_binary_1MB.bin", 1024 * 1024, true, FileType.BINARY);
        Measure.read("target/buffered_binary_1MB.bin", true, FileType.BINARY);

        Measure.write("target/buffered_binary_5MB.bin", 5 * 1024 * 1024, true, FileType.BINARY);
        Measure.read("target/buffered_binary_5MB.bin", true, FileType.BINARY);

        // Test on text

        Measure.write("target/text_1B.bin", 1, false, FileType.TEXT);
        Measure.read("target/text_1B.bin", false, FileType.TEXT);

        Measure.write("target/text_1KB.bin", 1024, false, FileType.TEXT);
        Measure.read("target/text_1KB.bin", false, FileType.TEXT);

        Measure.write("target/text_1MB.bin", 1024 * 1024, false, FileType.TEXT);
        Measure.read("target/text_1MB.bin", false, FileType.TEXT);

        Measure.write("target/text_5MB.bin", 5 * 1024 * 1024, false, FileType.TEXT);
        Measure.read("target/text_5MB.bin", false, FileType.TEXT);

        // Test on buffered text

        Measure.write("target/buffered_text_1B.bin", 1, true, FileType.TEXT);
        Measure.read("target/buffered_text_1B.bin", true, FileType.TEXT);

        Measure.write("target/buffered_text_1KB.bin", 1024, true, FileType.TEXT);
        Measure.read("target/buffered_text_1KB.bin", true, FileType.TEXT);

        Measure.write("target/buffered_text_1MB.bin", 1024 * 1024, true, FileType.TEXT);
        Measure.read("target/buffered_text_1MB.bin", true, FileType.TEXT);

        Measure.write("target/buffered_text_5MB.bin", 5 * 1024 * 1024, true, FileType.TEXT);
        Measure.read("target/buffered_text_5MB.bin", true, FileType.TEXT);
    }
}
