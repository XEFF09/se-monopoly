/*
6510405521
Thatpong Wongchaita
 */

package monopoly;

import java.util.List;

public class Player {
    private String name;
    private Piece piece;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return this.name;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void takeTurn(List<Die> dice, Board board) {
        int sum_roll = 0;
        Square oldLoc;
        Square newLoc;

        for (Die d: dice) {
            d.roll();
            sum_roll += d.getFaceValue();
        }

        System.out.println("Player " + name + " rolled " + sum_roll);

        oldLoc = piece.getLocation();
        newLoc = board.getSquare(oldLoc, sum_roll);
        piece.setLocation(newLoc);

        System.out.println("Player " + name + " moved from " + oldLoc.getIndex() + " to " + newLoc.getIndex());
    }
}
