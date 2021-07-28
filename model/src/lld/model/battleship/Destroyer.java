package lld.model.battleship;

/**
 * @author Pradeep Arya
 */
public class Destroyer implements Ship {
    @Override
    public int size() {
        return 2;
    }

    @Override
    public ShipType type() {
        return ShipType.DESTROYER;
    }
}
