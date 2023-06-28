package homework10;

public abstract class Platform {
    String platformName;
    int screenResolution;

    public Platform(String platformName,int screenResolution){
        this.platformName = platformName;
        this.screenResolution = screenResolution;
    }
    public abstract String getInputDevice();

    public String getPlatformName() {
        return platformName;
    }

    public abstract String playGame();

}
