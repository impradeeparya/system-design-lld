package lld.model.battleship;

/**
 * @author Pradeep Arya
 */
public class Cell {

    private boolean safe;
    private boolean containShip;
    private Ship ship;
    private SpotType spot;

    public boolean isSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }

    public boolean isContainShip() {
        return containShip;
    }

    public void setContainShip(boolean containShip) {
        this.containShip = containShip;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public SpotType getSpot() {
        return spot;
    }

    public void setSpot(SpotType spot) {
        this.spot = spot;
    }
}
