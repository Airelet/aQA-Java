package homework14.platforms;

import homework14.games.Game;
import homework14.games.ScreenResolution;
import homework14.inputDevices.Controller;

public class Windows extends PC {


    public Windows(ScreenResolution screenResolution, Controller controller) {
        super(screenResolution, controller);
    }

    @Override
    public String getPlatformName() {
        return "Windows Home 11";
    }

    public void setInputDevice(Controller controller) {
        super.setInputDevice(controller);
    }

    @Override
    public void startGame(Game game) {
        switch (getScreenResolution()) {
            case 720:
                System.out.println(".exe file opening...");
                game.playGame(this);
                break;
            case 1080:
                System.out.println(".EXE FILE OPENING...");
                game.playGame(this);
                break;
            default:
                System.out.println(".exe file OPENING...");
                game.playGame(this);
                break;
        }

    }
}
