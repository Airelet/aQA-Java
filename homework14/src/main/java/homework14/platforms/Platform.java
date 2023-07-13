package homework14.platforms;

import homework14.games.Game;
import homework14.games.ScreenResolution;
import homework14.inputDevices.Controller;

public abstract class Platform {
    private final String platformName;
    private ScreenResolution screenResolution;
    private Controller inputDevice;

    public Platform(String platformName, ScreenResolution screenResolution, Controller controller) {
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

    public void setScreenResolution(ScreenResolution screenResolution) {
        this.screenResolution = screenResolution;
    }

    public int getScreenResolution() {
        return screenResolution.getPixelResolution();
    }

    public abstract void startGame(Game game);

    @Override
    public String toString() {
        return "Platform name: " + platformName + "; " +
                "Screen resolution: " + screenResolution + "; \n" +
                "Input device: " + inputDevice.getInputDeviceName();
    }
}
