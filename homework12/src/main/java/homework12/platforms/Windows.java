package homework12.platforms;

import homework12.games.Game;

public class Windows extends PC {

    public Windows(int screenResolution) {
        super(screenResolution);
    }

    @Override
    public String getPlatformName() {
        return "Windows Home 11";
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
