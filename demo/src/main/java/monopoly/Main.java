/*
6510405521
Thatpong Wongchaita
 */

package monopoly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Square[] squares = new Square[40];
        for (int i = 0; i < 40; i++) {
            squares[i] = new Square("Square " + i, i);
        }
        Board board = new Board(squares);
    
        Die d1 = new Die();
        Die d2 = new Die();
        List<Die> dice = new ArrayList<Die>();
        dice.add(d1);
        dice.add(d2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an n_player(2-8): ");
        int n_player = scanner.nextInt();

        while ((n_player < 2) || (n_player > 8)) {
            System.out.print("Enter an n_player(2-8): ");
            n_player = scanner.nextInt();
        }
        scanner.close();

        List<Player> players = new ArrayList<Player>();
        for (int i=0; i<n_player; i++) {
            players.add(new Player("Player " + i, new Piece(squares)));
        }

        MGame mgame = new MGame(10, board, players, dice);
        mgame.playGame();
    }
}