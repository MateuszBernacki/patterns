package observer;

public class ObserverDemo  {
    public static void main(String[] args) {
        GameBoard game = new GameBoard();

        Player player1 = new Player("ADAM");
        Player player2 = new Player("EWA");
        game.addObserver(player1);
        game.addObserver(player2);

        game.makeMove(10,11);
    }
}
