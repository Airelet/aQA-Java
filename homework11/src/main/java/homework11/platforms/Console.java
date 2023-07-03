package homework11.platforms;

public abstract class Console extends Platform {

    public Console(String platformName, int screenResolution) {
        super(platformName, screenResolution);
        setEnterButton("Start");
    }

    @Override
    public String getInputDevice() {
        return "controller";
    }


}
