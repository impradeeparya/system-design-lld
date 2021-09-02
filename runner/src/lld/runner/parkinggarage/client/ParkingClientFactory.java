package lld.runner.parkinggarage.client;

import lld.service.parkinggarage.command.CommandFactory;

/**
 * @author Pradeep Arya
 */
public class ParkingClientFactory {

    public static ParkingRunnerClient getClientRunner(String[] args, CommandFactory commandFactory) {
        if (args.length == 0) {
            return new CommandLineRunner(commandFactory);
        } else {
            return new FileRunner(commandFactory);
        }
    }
}
