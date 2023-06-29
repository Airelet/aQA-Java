package homework10;

public abstract class Console extends Platform {

    public Console(String platformName, int screenResolution) {
        super(platformName, screenResolution);
    }

    @Override
    public String getInputDevice() {
        return "controller";
    }


}
