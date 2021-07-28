package lld.service.battleship.game;

import lld.model.battleship.Cell;
import lld.model.battleship.Player;
import lld.model.battleship.SpotType;

/**
 * @author Pradeep Arya
 */
public class MissileLauncher implements Launcher {
    @Override
    public void launch(Player player, Player enemy, int x, int y) {
        SpotType spotType;
        boolean isHit = enemy.isHit(x, y);
        if (isHit) {
            spotType = SpotType.RED;
            enemy.setShipArea(enemy.getShipArea() - 1);
        } else {
            spotType = SpotType.WHITE;
        }

        Cell enemyCell = enemy.getShipBoard()[x][y];
        enemyCell.setSpot(spotType);
        enemyCell.setSafe(isHit);

        Cell playerTrackCell = player.getTrackerBoard()[x][y];
        playerTrackCell.setSpot(spotType);
        playerTrackCell.setSafe(isHit);
    }
}
