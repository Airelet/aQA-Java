package homework12.platforms;

import homework12.games.Game;
import homework12.inputDevices.Controller;

public class Windows extends PC {


    public Windows(int screenResolution, Controller controller) {
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
