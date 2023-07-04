package homework12.inputDevices;

public abstract class Controller {
    private final String inputDeviceName;
    private String actionButton1;
    private String actionButton2;
    private String actionButton3;
    private String actionButton4;
    private String up;
    private String down;
    private String right;
    private String left;
    private String escape;

    public Controller(String inputDeviceName, String actionButton1, String actionButton2, String actionButton3, String actionButton4, String up,
                      String down, String right, String left, String escape) {
        this.inputDeviceName = inputDeviceName;
        this.actionButton1 = actionButton1;
        this.actionButton2 = actionButton2;
        this.actionButton3 = actionButton3;
        this.actionButton4 = actionButton4;
        this.up = up;
        this.down = down;
        this.right = right;
        this.left = left;
        this.escape = escape;
    }

    public String getInputDeviceName() {
        return inputDeviceName;
    }

    public String getActionButton1() {
        return actionButton1;
    }

    public void setActionButton1(String actionButton1) {
        this.actionButton1 = actionButton1;
    }

    public String getActionButton2() {
        return actionButton2;
    }

    public void setActionButton2(String actionButton2) {
        this.actionButton2 = actionButton2;
    }

    public String getActionButton3() {
        return actionButton3;
    }

    public void setActionButton3(String actionButton3) {
        this.actionButton3 = actionButton3;
    }

    public String getActionButton4() {
        return actionButton4;
    }

    public void setActionButton4(String actionButton4) {
        this.actionButton4 = actionButton4;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getDown() {
        return down;
    }

    public void setDown(String down) {
        this.down = down;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getEscape() {
        return escape;
    }

    public void setEscape(String escape) {
        this.escape = escape;
    }

    @Override
    public String toString() {
        return "Input device name: " + inputDeviceName + "\n" +
                "Action Button 1: " + actionButton1 + "\n" +
                "Action Button 2: " + actionButton2 + "\n" +
                "Action Button 3: " + actionButton3 + "\n" +
                "Action Button 4: " + actionButton4 + "\n" +
                "Up: " + up + "\n" +
                "Down: " + down + "\n" +
                "Right: " + right + "\n" +
                "Left: " + left + "\n" +
                "Escape: " + escape;
    }
}
