package lld.service.parkinggarage.handler;

import lld.model.parkiggarage.ParkingGarage;
import lld.model.parkiggarage.TwoWheeler;
import lld.model.parkiggarage.Vehicle;

import java.util.Map;

/**
 * @author Pradeep Arya
 */
public class ParkingHandler implements GarageHandler {

    @Override
    public void handle(ParkingGarage parkingGarage, Map<String, Object> data) {
        Vehicle vehicle = new TwoWheeler((String) data.get("vehicle_registration_number"));
        parkingGarage.park(vehicle);
    }
}
