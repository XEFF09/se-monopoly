/*
6510405521
Thatpong Wongchaita
 */

package monopoly;

import java.util.List;

public class MGame {

    private int roundCnt;
    private List<Die> dice;
    private Board board;
    private List<Player> players;
    private int n;

    public MGame(int n, Board board, List<Player> players, List<Die> dice) {
        this.roundCnt = 0;
        this.n = n;
        this.dice = dice;
        this.board = board;
        this.players = players;
    }


    public void playGame() {
        for (; roundCnt < n; roundCnt++) {
            this.playRound();
            System.out.println("Round " + roundCnt + " completed");
        }
    }
    private void playRound() {
        for (Player p: players) {
            p.takeTurn(dice, board);
            System.out.println(p.getName() + " has completed their turn");
        }
    }
}
