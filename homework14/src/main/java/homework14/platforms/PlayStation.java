package homework14.platforms;

import homework14.games.Game;
import homework14.games.ScreenResolution;
import homework14.inputDevices.PSController;

public class PlayStation extends Console {

    public PlayStation(ScreenResolution screenResolution, PSController psController) {
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
