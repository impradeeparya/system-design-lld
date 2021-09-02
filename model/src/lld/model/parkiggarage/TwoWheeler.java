package lld.model.parkiggarage;

/**
 * @author Pradeep Arya
 */
public class TwoWheeler implements Vehicle {

    private String registrationNumber;

    public TwoWheeler(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.TWO_WHEELER;
    }

    @Override
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    @Override
    public String toString() {
        return "TwoWheeler{" +
                "registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
