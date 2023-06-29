package homework10;

public class PlayStation extends Console {
    public PlayStation(int screenResolution) {
        super("Play Station", screenResolution);
    }

    @Override
    public String getInputDevice() {
        return "PS controller";
    }

    @Override
    public String playGame() {
        return "Unavailable for your device: " + getPlatformName();
    }

}
