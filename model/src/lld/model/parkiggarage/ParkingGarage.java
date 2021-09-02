package lld.model.parkiggarage;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

/**
 * @author Pradeep Arya
 */
public class ParkingGarage {

    private SortedSet<ParkingSlot> availableSlots;
    private Set<ParkingSlot> occupiedSlots;


    public ParkingGarage(int slots) {
        this.availableSlots = new TreeSet<>();
        this.occupiedSlots = new HashSet<>();

        IntStream.range(0, slots).forEach(index -> availableSlots.add(new ParkingSlot(index + 1)));
    }

    public ParkingSlot park(Vehicle vehicle) {
        ParkingSlot parkingSlot = availableSlots.first();
        parkingSlot.setVehicle(vehicle);
        this.availableSlots.remove(parkingSlot);
        this.occupiedSlots.add(parkingSlot);
        return parkingSlot;
    }

    public void status() {
        this.occupiedSlots.stream().forEach(System.out::println);
    }

    public ParkingSlot leave(int slotNumber) {
        Optional<ParkingSlot> reservedParkingSlot = occupiedSlots.stream().filter(slot -> slot.getId() == slotNumber).findFirst();
        ParkingSlot parkingSlot = null;
        if (reservedParkingSlot.isPresent()) {
            parkingSlot = reservedParkingSlot.get();
            parkingSlot.clear();
            occupiedSlots.remove(parkingSlot);
            availableSlots.add(parkingSlot);
        }
        return parkingSlot;
    }

}
