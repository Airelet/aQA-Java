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
            System.out.println("To start a new game press " + platform.getInputDevice().getActionButton1());
            System.out.println(platform.getInputDevice().getActionButton1() + " was pressed");
            spawnLevel();
            System.out.println(field);
            spawnStone();
            System.out.println(field);
            cleanTheField();
        }
    }

    private StringBuilder field = new StringBuilder();

    private void spawnLevel() {
        for (int i = 0; i < 6; i++) {
            field.append(".".repeat(10));
            field.append("\n");
        }
    }

    private void spawnStone() {
        field.setCharAt(5, '#');
        field.setCharAt(16, '#');
        field.setCharAt(26, '#');
        field.setCharAt(27, '#');
    }

    private void cleanTheField() {
        field.setLength(0);
    }

}
