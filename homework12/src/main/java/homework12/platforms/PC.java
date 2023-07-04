package homework12.platforms;

import homework12.inputDevices.Controller;

public abstract class PC extends Platform {

    public PC(int screenResolution, Controller controller) {
        super("PC", screenResolution, controller);
    }

}
