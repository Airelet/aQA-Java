package homework14.games;

import homework14.platforms.Platform;

import java.util.List;

public abstract class Game {
    private final String gameName;
    private final int minScreenResolution;
    private final List<Platform> supportedPlatforms;

    public Game(String gamesName, List<Platform> supportedPlatforms, int minScreenResolution) {
        this.gameName = gamesName;
        this.supportedPlatforms = supportedPlatforms;
        this.minScreenResolution = minScreenResolution;
    }

    protected boolean meetsScreenResolutionReq(Platform platform) {
        return (platform.getScreenResolution() >= minScreenResolution);
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

        return "The Name of the game: " + gameName + "\n" +
                "Minimal screen for the game: " + minScreenResolution + "\n" +
                "Platforms supported by the game: " + platformNamesBuilder;
    }
}
