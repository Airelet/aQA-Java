package homework14.platforms;

import homework14.games.ScreenResolution;
import homework14.inputDevices.Controller;

public abstract class Console extends Platform {

    public Console(String platformName, ScreenResolution screenResolution, Controller controller) {
        super(platformName, screenResolution, controller);
    }

}
