package homework11.platforms;

import homework11.games.Game;

public abstract class Platform {
    private final String platformName;
    private int screenResolution;
    private String enterButton;

    public Platform(String platformName, int screenResolution) {
        this.platformName = platformName;
        this.screenResolution = screenResolution;
    }

    public abstract String getInputDevice();

    public String getPlatformName() {
        return platformName;
    }

    public void setScreenResolution(int screenResolution) {
        this.screenResolution = screenResolution;
    }

    public int getScreenResolution() {
        return screenResolution;
    }

    public abstract void startGame(Game game);

    protected void setEnterButton(String enterButton) {
        this.enterButton = enterButton;
    }

    public String getEnterButton() {
        return enterButton;
    }

}
