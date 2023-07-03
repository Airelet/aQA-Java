package homework11.platforms;

import homework11.games.Game;

public class PlayStation extends Console {
    public PlayStation(int screenResolution) {
        super("Play Station", screenResolution);
    }

    @Override
    public String getInputDevice() {
        return "PS controller";
    }

    @Override
    public void startGame(Game game) {
        System.out.println("game opens from your library...");
        game.playGame(this);
    }

}
