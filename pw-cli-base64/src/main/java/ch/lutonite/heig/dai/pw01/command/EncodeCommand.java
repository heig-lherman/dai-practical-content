package ch.lutonite.heig.dai.pw01.command;

import java.io.InputStream;
import java.io.OutputStream;
import picocli.CommandLine.Command;

/**
 * Decode a base64-encoded file to an output file.
 *
 * @author Loïc Herman
 */
@Command(
        name = "encode",
        description = "Encode a file to a base64-encoded output file"
)
public class EncodeCommand extends AbstractOperationCommand {

    @Override
    protected OutputStream buildOutputStream(InputStream inputStream) {
        return null;
    }
}
