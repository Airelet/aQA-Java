package homework14.platforms;

import homework14.games.Game;
import homework14.games.ScreenResolution;
import homework14.inputDevices.XboxController;

public class Xbox extends Console {
    public Xbox(ScreenResolution screenResolution, XboxController xboxController) {
        super("Xbox", screenResolution, xboxController);
    }

    public void setInputDevice(XboxController xboxController) {
        super.setInputDevice(xboxController);
    }

    @Override
    public void startGame(Game game) {
        System.out.println("game opens from CD...");
        game.playGame(this);
    }
}
