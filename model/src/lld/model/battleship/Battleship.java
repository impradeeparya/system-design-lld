package lld.model.battleship;

/**
 * @author Pradeep Arya
 */
public class Battleship implements Ship {
    @Override
    public int size() {
        return 4;
    }

    @Override
    public ShipType type() {
        return ShipType.BATTLESHIP;
    }
}
