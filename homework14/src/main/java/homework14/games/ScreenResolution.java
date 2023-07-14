package homework14.games;

public enum ScreenResolution {
    P420(420),
    HD(720),
    FULL_HD(1080),
    TWO_K(1440),
    FOUR_K(2160);

    private final int pixelResolution;

    ScreenResolution(int pixelResolution) {
        this.pixelResolution = pixelResolution;
    }

    public static ScreenResolution toScreenResolution(int pixelResolution) {
        for (ScreenResolution resolution : values()) {
            if (resolution.pixelResolution == pixelResolution) {
                return resolution;
            }
        }
        return null;
    }

    public int getPixelResolution() {
        return this.pixelResolution;
    }
}
