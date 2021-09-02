package lld.service.parkinggarage.command.handler;

/**
 * @author Pradeep Arya
 */
public class ExitCommand implements Command {
    @Override
    public void execute(String[] params) {
        System.out.println("ExitCommand");
        System.exit(1);
    }
}
