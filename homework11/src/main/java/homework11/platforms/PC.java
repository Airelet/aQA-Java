package homework11.platforms;

public abstract class PC extends Platform {


    public PC(int screenResolution) {
        super("PC", screenResolution);
        setEnterButton("Enter");
    }

    @Override
    public String getInputDevice() {
        return "Keyboard & Mouse";
    }
}
