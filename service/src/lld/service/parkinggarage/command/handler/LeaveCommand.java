package lld.service.parkinggarage.command.handler;

import lld.model.parkiggarage.ParkingGarage;
import lld.service.parkinggarage.handler.GarageHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pradeep Arya
 */
public class LeaveCommand implements Command {
    private GarageHandler garageHandler;
    private ParkingGarage parkingGarage;

    public LeaveCommand(GarageHandler garageHandler, ParkingGarage parkingGarage) {
        this.garageHandler = garageHandler;
        this.parkingGarage = parkingGarage;
    }

    @Override
    public void execute(String[] params) {
        System.out.println("LeaveCommand");
        Map<String, Object> data = new HashMap<>();
        data.put("parking_slot_number", Integer.parseInt(params[1]));
        garageHandler.handle(parkingGarage, data);
    }
}
