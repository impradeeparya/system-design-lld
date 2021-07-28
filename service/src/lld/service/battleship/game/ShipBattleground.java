package lld.service.battleship.game;

import lld.model.battleship.Cell;
import lld.model.battleship.Player;
import lld.model.battleship.Ship;
import lld.model.battleship.ShipType;
import lld.service.battleship.factory.ShipFactory;

import java.util.Scanner;

/**
 * @author Pradeep Arya
 */
public class ShipBattleground implements Battleground {

    private Player firstPlayer;
    private Player secondPlayer;
    private int numberOfShip = 1;
    private ShipFactory shipFactory;
    private Launcher launcher;

    public ShipBattleground(int area) {
        firstPlayer = new Player(area, "firstPlayer");
        secondPlayer = new Player(area, "secondPlayer");
        shipFactory = new ShipFactory();
        launcher = new MissileLauncher();
        placeShip(firstPlayer, numberOfShip);
        placeShip(secondPlayer, numberOfShip);
    }

    public void placeShip(Player player, int numberOfShip) {
        Scanner scanner = new Scanner(System.in);
        int shipArea = 0;
        while (numberOfShip > 0) {
            System.out.println("Enter ship type and location for " + player.getName());
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");
            Ship ship = shipFactory.getShip(ShipType.valueOf(inputs[0]));
            Cell[][] shipBoard = player.getShipBoard();
            int sourceX = Integer.parseInt(inputs[1]);
            int sourceY = Integer.parseInt(inputs[2]);
            int destinationX = Integer.parseInt(inputs[3]);
            for (int index = 0; index < ship.size(); index++) {
                Cell shipBoardCell = shipBoard[sourceX][sourceY];
                shipBoardCell.setShip(ship);
                shipBoardCell.setContainShip(true);

                if (destinationX == sourceX) {
                    sourceY++;
                } else {
                    sourceX++;
                }
                shipArea++;
            }
            numberOfShip--;
        }
        player.setShipArea(shipArea);

    }

    @Override
    public void start() {

        boolean isPlayerOne = true;

        while (true) {
            Player player = isPlayerOne ? firstPlayer : secondPlayer;
            Player enemy = isPlayerOne ? secondPlayer : firstPlayer;

            if (player.getShipArea() == 0) {
                System.out.println("Player " + enemy.getName() + " won");
                break;
            }

            if (enemy.getShipArea() == 0) {
                System.out.println("Player " + player.getName() + " won");
                break;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter target location");
            String input = scanner.nextLine();
            String inputs[] = input.split(" ");
            String location = inputs[1];

            int x = location.charAt(0) - 65;
            int y = location.charAt(1) - 48;
            System.out.println("Player " + player.getName() + " firing on " + x + " " + y);
            launcher.launch(player, enemy, x, y);
            isPlayerOne = !isPlayerOne;
        }
    }
}
