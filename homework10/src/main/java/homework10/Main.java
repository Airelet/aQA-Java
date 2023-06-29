package homework10;

public class Main {
    public static void main(String[] args) {

        // task 1-3
        Windows windows = new Windows(720);
        System.out.println(windows.playGame());
        System.out.println("on your " + windows.getPlatformName());
        PlayStation playStation = new PlayStation(1080);
        System.out.println(playStation.playGame());

        // task 4
        StringBuilder stringBuilder = new StringBuilder();
        int number1 = 3;
        int number2 = 56;
        stringBuilder.append(number1)
                .append(" + ")
                .append(number2)
                .append(" = ")
                .append(number1 + number2)
                .append("\n");
        stringBuilder.append(number1)
                .append(" - ")
                .append(number2)
                .append(" = ")
                .append(number1 - number2)
                .append("\n");
        stringBuilder.append(number1)
                .append(" * ")
                .append(number2)
                .append(" = ")
                .append(number1 * number2)
                .append("\n");
        System.out.println(stringBuilder);

        int placeForEquals = stringBuilder.indexOf("=");

        stringBuilder.deleteCharAt(placeForEquals);
        stringBuilder.insert(placeForEquals, "равно");

        placeForEquals = stringBuilder.indexOf("=");

        stringBuilder.deleteCharAt(placeForEquals);
        stringBuilder.replace(placeForEquals, placeForEquals, "равно");

        System.out.println(stringBuilder);
    }
}