package homework10;

public class Windows extends PC {

    public Windows(int screenResolution) {
        super(screenResolution);
    }

    @Override
    public String getPlatformName() {
        return "Windows Home 11";
    }

    @Override
    public String playGame() {
        switch (this.screenResolution) {
            case 720:
                return ".exe file opening...";
            case 1080:
                return ".EXE FILE OPENING...";
            default:
                return "Unexpected screen resolution";
        }

    }
}
