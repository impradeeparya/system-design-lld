package lld.runner.parkinggarage;

import lld.runner.parkinggarage.client.ParkingClientFactory;
import lld.runner.parkinggarage.client.ParkingRunnerClient;
import lld.service.parkinggarage.command.CommandFactory;

/**
 * @author Pradeep Arya
 */
public class ParkingGarageRunner {

    public static void main(String[] args) {
        CommandFactory commandFactory = CommandFactory.init();
        ParkingRunnerClient parkingRunnerClient = ParkingClientFactory.getClientRunner(args, commandFactory);
        parkingRunnerClient.execute();
    }
}
