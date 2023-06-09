package homework11.platforms;

import homework11.games.Game;

public class Xbox extends Console {
    public Xbox(int screenResolution) {
        super("Xbox", screenResolution);
    }

    @Override
    public String getInputDevice() {
        return "Xbox controller";
    }

    @Override
    public void startGame(Game game) {
        System.out.println("game opens from CD...");
        game.playGame(this);
    }
}
