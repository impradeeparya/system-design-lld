package lld.runner.battleship;

import lld.service.battleship.game.Battleground;
import lld.service.battleship.game.ShipBattleground;

/**
 * @author Pradeep Arya
 */
public class BattleshipRunner {
    public static void main(String[] args) {

        int n = 10;
        Battleground battleground = new ShipBattleground(n);
        battleground.start();


    }
}
