package Models;

public class Move {

    private Player player;

    private Cells cell;

    public Move(Player player, Cells cell) {
        this.player = player;
        this.cell = cell;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cells getCell() {
        return cell;
    }

    public void setCell(Cells cell) {
        this.cell = cell;
    }

}
