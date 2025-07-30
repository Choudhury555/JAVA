package OOPS_BASIC.INTERFACE;

public class GameRunner {
    public static void main(String[] args) {
//        GamingConsole gamePlayer = new MarioGame();
        GamingConsole gamePlayer = new ChessGame();
        gamePlayer.up();
        gamePlayer.down();
        gamePlayer.left();
        gamePlayer.right();
    }
}
