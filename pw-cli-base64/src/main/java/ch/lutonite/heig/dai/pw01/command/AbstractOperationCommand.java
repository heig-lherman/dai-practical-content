package ch.lutonite.heig.dai.pw01.command;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import picocli.CommandLine.Option;

/**
 * Abstract class that manages parsing the provided arguments and options for every
 * input-to-output file operation that is handled through the CLI.
 *
 * @author Loïc Herman
 * @see EncodeCommand
 * @see DecodeCommand
 */
abstract class AbstractOperationCommand implements Callable<Integer> {

    @Option(names = {"-h", "--help"}, usageHelp = true, description = "display this help message")
    boolean usageHelpRequested;

    @Option(
            names = {"-i", "--input-file"},
            description = "input file path"
    )
    private Path inputFilePath;

    @Option(
            names = {"--input-encoding"},
            description = "input file encoding",
            defaultValue = "UTF-8"
    )
    protected Charset inputEncoding = StandardCharsets.UTF_8;

    @Option(
            names = {"-o", "--output-file"},
            description = "output file path"
    )
    private Path outputFilePath;

    @Option(
            names = {"--output-encoding"},
            description = "output file encoding",
            defaultValue = "UTF-8"
    )
    protected Charset outputEncoding = StandardCharsets.UTF_8;

    protected abstract OutputStream buildOutputStream(InputStream inputStream);

    @Override
    public final Integer call() {
        return 0;
    }
}
