package homework14.platforms;

import homework14.inputDevices.Controller;

public abstract class PC extends Platform {

    public PC(int screenResolution, Controller controller) {
        super("PC", screenResolution, controller);
    }

}
