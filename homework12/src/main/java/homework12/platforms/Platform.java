package homework12.platforms;

import homework12.games.Game;
import homework12.inputDevices.Controller;

public abstract class Platform {
    private final String platformName;
    private int screenResolution;
    private Controller inputDevice;

    public Platform(String platformName, int screenResolution, Controller controller) {
        this.platformName = platformName;
        this.screenResolution = screenResolution;
        this.inputDevice = controller;
    }

    public Controller getInputDevice() {
        return inputDevice;
    }

    protected void setInputDevice(Controller inputDevice) {
        this.inputDevice = inputDevice;
    }

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

    @Override
    public String toString() {
        return "Platform name: " + platformName + "; " +
                "Screen resolution: " + screenResolution + "; \n" +
                "Input device: " + inputDevice.getInputDeviceName();
    }
}
