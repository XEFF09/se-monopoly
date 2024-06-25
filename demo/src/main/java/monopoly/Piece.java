package monopoly;

public class Piece {

    private Square curr;

    public Piece(Square[] squares) {
        this.curr = squares[0];
    }

    public Square getLocation() {
        return this.curr;
    }
    public void setLocation(Square newLoc) {
        this.curr = newLoc;
    }
}
