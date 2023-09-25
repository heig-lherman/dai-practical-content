package ch.lutonite.heig.dai.pw01;

import ch.lutonite.heig.dai.pw01.command.DecodeCommand;
import ch.lutonite.heig.dai.pw01.command.EncodeCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;

/**
 * Base64 encoder/decoder main CLI class.
 *
 * @author Loïc Herman
 * @see EncodeCommand
 * @see DecodeCommand
 */
@Command(
        name = "base64",
        description = "Base64 file encoder and decoder",
        version = "base64 1.0.0",
        mixinStandardHelpOptions = true,
        subcommands = {
                HelpCommand.class,
                EncodeCommand.class,
                DecodeCommand.class,
        }
)
public class Base64Cli implements Runnable {

    @Override
    public void run() {
        CommandLine.usage(this, System.out);
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Base64Cli()).execute(args);
        System.exit(exitCode);
    }
}
