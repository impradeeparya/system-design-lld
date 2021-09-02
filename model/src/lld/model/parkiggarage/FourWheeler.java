package lld.model.parkiggarage;

/**
 * @author Pradeep Arya
 */
public class FourWheeler implements Vehicle {

    private String registrationNumber;

    public FourWheeler(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.FOUR_WHEELER;
    }

    @Override
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    @Override
    public String toString() {
        return "FourWheeler{" +
                "registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
