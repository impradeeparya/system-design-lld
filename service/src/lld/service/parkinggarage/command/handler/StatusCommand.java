package lld.service.parkinggarage.command.handler;

import lld.model.parkiggarage.ParkingGarage;
import lld.service.parkinggarage.handler.GarageHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pradeep Arya
 */
public class StatusCommand implements Command {
    private GarageHandler garageHandler;
    private ParkingGarage parkingGarage;

    public StatusCommand(GarageHandler garageHandler, ParkingGarage parkingGarage) {
        this.garageHandler = garageHandler;
        this.parkingGarage = parkingGarage;
    }

    @Override
    public void execute(String[] params) {
        System.out.println("StatusCommand");
        Map<String, Object> data = new HashMap<>();
        garageHandler.handle(parkingGarage, data);
    }
}
