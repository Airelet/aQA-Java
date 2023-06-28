package homework10;

public class Xbox extends Console {
    public Xbox(int screenResolution) {
        super("Xbox", screenResolution);
    }

    @Override
    public String getInputDevice() {
        return "Xbox controller";
    }

    @Override
    public String playGame() {
        return "game opens from CD...";
    }
}
