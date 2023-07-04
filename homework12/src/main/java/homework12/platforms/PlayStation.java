package homework12.platforms;

import homework12.games.Game;
import homework12.inputDevices.PSController;

public class PlayStation extends Console {

    public PlayStation(int screenResolution, PSController psController) {
        super("Play Station", screenResolution, psController);
    }

    @Override
    public void startGame(Game game) {
        System.out.println("game opens from your library...");
        game.playGame(this);
    }

    public void setInputDevice(PSController psController) {
        super.setInputDevice(psController);
    }
}
