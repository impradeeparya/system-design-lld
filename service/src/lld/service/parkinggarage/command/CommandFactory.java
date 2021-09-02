package lld.service.parkinggarage.command;

import lld.model.parkiggarage.ParkingGarage;
import lld.service.parkinggarage.command.handler.Command;
import lld.service.parkinggarage.command.handler.ExitCommand;
import lld.service.parkinggarage.command.handler.LeaveCommand;
import lld.service.parkinggarage.command.handler.ParkCommand;
import lld.service.parkinggarage.command.handler.StatusCommand;
import lld.service.parkinggarage.handler.LeaveHandler;
import lld.service.parkinggarage.handler.ParkingHandler;
import lld.service.parkinggarage.handler.StatusHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pradeep Arya
 */
public class CommandFactory {

    //    private static CommandFactory commandFactory;
    private Map<String, Command> commands;
    private ParkingGarage parkingGarage;

    private CommandFactory() {
        commands = new HashMap<>();
        parkingGarage = new ParkingGarage(6);
    }

    private static class CommandFactoryHolder {
        private static final CommandFactory COMMAND_FACTORY = new CommandFactory();
    }

    //    lazy initialization with static inner class
    public static CommandFactory init() {

        CommandFactory commandFactory = CommandFactoryHolder.COMMAND_FACTORY;
        commandFactory.addCommand("park", new ParkCommand(new ParkingHandler(), commandFactory.parkingGarage));
        commandFactory.addCommand("leave", new LeaveCommand(new LeaveHandler(), commandFactory.parkingGarage));
        commandFactory.addCommand("status", new StatusCommand(new StatusHandler(), commandFactory.parkingGarage));
        commandFactory.addCommand("exit", new ExitCommand());

        return commandFactory;
    }

//    double check locking
//    public static CommandFactory init() {
//
//        if (commandFactory == null) {
//            synchronized (CommandFactory.class) {
//                if (commandFactory == null) {
//                    commandFactory = new CommandFactory();
//                    commandFactory.addCommand("park", new ParkCommand());
//                    commandFactory.addCommand("leave", new LeaveCommand());
//                    commandFactory.addCommand("status", new StatusCommand());
//                    commandFactory.addCommand("exit", new ExitCommand());
//                }
//            }
//        }
//
//        return commandFactory;
//    }

    public void addCommand(String commandName, Command command) {
        commands.put(commandName, command);
    }

    public Command getCommand(String commandName) {
        return commands.get(commandName);
    }
}
