package lld.runner.parkinggarage.client;

import lld.service.parkinggarage.command.CommandFactory;

import java.util.Scanner;

/**
 * @author Pradeep Arya
 */
public class CommandLineRunner implements ParkingRunnerClient {

    private CommandFactory commandFactory;

    public CommandLineRunner(CommandFactory commandFactory) {
        this.commandFactory = commandFactory;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inputLine = scanner.nextLine();
            String[] input = inputLine.split(" ");
            commandFactory.getCommand(input[0]).execute(input);
        }
    }
}
