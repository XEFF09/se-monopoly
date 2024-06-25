/*
6510405521
Thatpong Wongchaita
 */

package monopoly;

public class Board {

    private Square[] squares;

    public Board(Square[] squares) {
        this.squares = squares;
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        return squares[(oldLoc.getIndex() + fvTot) % squares.length];
    }
}
