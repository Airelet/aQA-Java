package homework14.games;

import homework14.platforms.Platform;

import java.util.List;

public abstract class Game {
    private final static List<Integer> SCREEN_RESOLUTIONS = List.of(420, 720, 1080, 1440, 2160);
    private final String gameName;
    private final int minScreenResolution;
    private final List<Platform> supportedPlatforms;

    public Game(String gamesName, List<Platform> supportedPlatforms, int minScreenResolution) {
        this.gameName = gamesName;
        this.supportedPlatforms = supportedPlatforms;
        this.minScreenResolution = minScreenResolution;
    }

    protected boolean meetsScreenResolutionReq(Platform platform) {
        return (platform.getScreenResolution() >= minScreenResolution &&
                SCREEN_RESOLUTIONS.contains(platform.getScreenResolution()));
    }

    public String getGameName() {
        return gameName;
    }

    protected boolean meetsMinReq(Platform platform) {
        if (!supportedPlatforms.contains(platform)) {
            System.out.println("Unavailable for your device: " + platform.getPlatformName());
            return false;
        } else if (!meetsScreenResolutionReq(platform)) {
            System.out.println("Your screen resolution is not supported");
            return false;
        } else {
            System.out.println("Playing the " + getGameName());
            return true;
        }
    }

    public abstract void playGame(Platform platform);

    @Override
    public String toString() {
        StringBuilder platformNamesBuilder = new StringBuilder();
        for (Platform platform : supportedPlatforms) {
            platformNamesBuilder.append(platform.getPlatformName());
            platformNamesBuilder.append(", ");
        }
        platformNamesBuilder.replace(platformNamesBuilder.length() - 2, platformNamesBuilder.length(), "");

        return "All possible screen resolutions in games: " + SCREEN_RESOLUTIONS + "\n" +
                "The Name of the game: " + gameName + "\n" +
                "Minimal screen for the game: " + minScreenResolution + "\n" +
                "Platforms supported by the game: " + platformNamesBuilder;
    }
}
