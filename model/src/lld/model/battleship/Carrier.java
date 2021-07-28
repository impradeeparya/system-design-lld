package lld.model.battleship;

/**
 * @author Pradeep Arya
 */
public class Carrier implements Ship {
    @Override
    public int size() {
        return 5;
    }

    @Override
    public ShipType type() {
        return ShipType.CARRIER;
    }
}
