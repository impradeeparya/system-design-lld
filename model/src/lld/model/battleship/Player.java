package lld.model.battleship;

/**
 * @author Pradeep Arya
 */
public class Player {

    private Cell[][] shipBoard;
    private Cell[][] trackerBoard;
    private int shipArea;
    private String name;

    public Player(int area, String name) {
        this.name = name;
        shipBoard = new Cell[area][area];
        trackerBoard = new Cell[area][area];
        initBoard(area);
    }

    public Cell[][] getShipBoard() {
        return shipBoard;
    }

    public Cell[][] getTrackerBoard() {
        return trackerBoard;
    }

    public String getName() {
        return name;
    }

    public int getShipArea() {
        return shipArea;
    }

    public void setShipArea(int shipArea) {
        this.shipArea = shipArea;
    }

    private void initBoard(int n) {
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                Cell boardCell = new Cell();
                boardCell.setSafe(true);
                boardCell.setContainShip(false);
                shipBoard[row][column] = boardCell;


                Cell trackerCell = new Cell();
                trackerCell.setSafe(true);
                trackerCell.setContainShip(false);
                trackerBoard[row][column] = boardCell;
            }
        }
    }

    public boolean isHit(int x, int y) {
        return shipBoard[x][y].isContainShip();
    }
}
