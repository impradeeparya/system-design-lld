package lld.model.battleship;

/**
 * @author Pradeep Arya
 */
public class Cruiser implements Ship {
    @Override
    public int size() {
        return 3;
    }

    @Override
    public ShipType type() {
        return ShipType.CRUISER;
    }
}
