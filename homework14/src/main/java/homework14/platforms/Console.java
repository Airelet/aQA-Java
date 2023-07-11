package homework14.platforms;

import homework14.inputDevices.Controller;

public abstract class Console extends Platform {

    public Console(String platformName, int screenResolution, Controller controller) {
        super(platformName, screenResolution, controller);
    }

}
