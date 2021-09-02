package lld.service.parkinggarage.handler;

import lld.model.parkiggarage.ParkingGarage;

import java.util.Map;

/**
 * @author Pradeep Arya
 */
public class StatusHandler implements GarageHandler {

    @Override
    public void handle(ParkingGarage parkingGarage, Map<String, Object> data) {
        parkingGarage.status();
    }
}
