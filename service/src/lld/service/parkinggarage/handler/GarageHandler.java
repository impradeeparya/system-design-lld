package lld.service.parkinggarage.handler;

import lld.model.parkiggarage.ParkingGarage;

import java.util.Map;

/**
 * @author Pradeep Arya
 */
public interface GarageHandler {

    void handle(ParkingGarage parkingGarage, Map<String, Object> data);
}
