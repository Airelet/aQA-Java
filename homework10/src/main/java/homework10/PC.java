package homework10;

public abstract class PC extends Platform {


    public PC(int screenResolution) {
        super("PC", screenResolution);
    }

    @Override
    public String getInputDevice() {
        return "Keyboard & Mouse";
    }
}
