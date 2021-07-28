package lld.service.battleship.game;

import lld.model.battleship.Player;

/**
 * @author Pradeep Arya
 */
public interface Launcher {

    void launch(Player player, Player enemy, int x, int y);
}
