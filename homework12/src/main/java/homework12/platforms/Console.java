package homework12.platforms;

import homework12.inputDevices.Controller;

public abstract class Console extends Platform {

    public Console(String platformName, int screenResolution, Controller controller) {
        super(platformName, screenResolution, controller);
    }

}
