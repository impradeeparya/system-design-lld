package lld.service.parkinggarage.handler;

import lld.model.parkiggarage.ParkingGarage;
import lld.model.parkiggarage.TwoWheeler;
import lld.model.parkiggarage.Vehicle;

import java.util.Map;

/**
 * @author Pradeep Arya
 */
public class LeaveHandler implements GarageHandler {

    @Override
    public void handle(ParkingGarage parkingGarage, Map<String, Object> data) {
        int slotNumber = (int)data.getOrDefault("parking_slot_number", -1);
        parkingGarage.leave(slotNumber);
    }
}
