package lld.model.parkiggarage;

import java.util.Objects;

/**
 * @author Pradeep Arya
 */
public class ParkingSlot implements Comparable<ParkingSlot> {

    private int id;
    private VehicleType vehicleType;
    private Vehicle vehicle;

    public ParkingSlot(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSlot that = (ParkingSlot) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public int compareTo(ParkingSlot parkingSlot) {
        return this.id - parkingSlot.id;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "id=" + id +
                ", vehicleType=" + vehicleType +
                ", vehicle=" + vehicle +
                '}';
    }

    public void clear() {
        this.vehicle = null;
    }
}
