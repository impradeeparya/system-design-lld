package lld.service.battleship.factory;


import lld.model.battleship.Battleship;
import lld.model.battleship.Carrier;
import lld.model.battleship.Cruiser;
import lld.model.battleship.Destroyer;
import lld.model.battleship.Ship;
import lld.model.battleship.ShipType;
import lld.model.battleship.Submarine;

/**
 * @author Pradeep Arya
 */
public class ShipFactory {

    public Ship getShip(ShipType shipType) {

        Ship ship = null;

        switch (shipType) {
            case CARRIER:
                ship = new Carrier();
                break;
            case DESTROYER:
                ship = new Destroyer();
                break;
            case CRUISER:
                ship = new Cruiser();
                break;
            case SUBMARINE:
                ship = new Submarine();
                break;
            case BATTLESHIP:
                ship = new Battleship();
                break;
            default:
                break;
        }
        return ship;
    }
}
