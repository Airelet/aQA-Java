package homework12.games;

import homework12.platforms.Platform;

import java.util.List;

public class Tetris extends Game {
    private static final int MIN_SCREEN_RESOLUTION = 720;

    public Tetris(List<Platform> supportedPlatforms) {
        super("Tetris", supportedPlatforms, MIN_SCREEN_RESOLUTION);
    }

    @Override
    public void playGame(Platform platform) {
        if (meetsMinReq(platform)) {
            System.out.println("To start a new game press " + platform.getEnterButton());
        }
    }

}
