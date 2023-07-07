package homework12.platforms;

import homework12.games.Game;
import homework12.inputDevices.XboxController;

public class Xbox extends Console {
    public Xbox(int screenResolution, XboxController xboxController) {
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
