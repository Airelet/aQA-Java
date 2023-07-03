package homework12;

import homework12.games.Tetris;
import homework12.platforms.PlayStation;
import homework12.platforms.Windows;
import homework12.platforms.Xbox;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // task 1-3
        Windows windows = new Windows(720);
        Xbox xbox = new Xbox(1080);
        PlayStation playStation = new PlayStation(1080);

        Tetris game = new Tetris(List.of(windows, xbox));

        windows.startGame(game);
        System.out.println("------------------------------");
        playStation.startGame(game);
        System.out.println("------------------------------");
        xbox.setScreenResolution(420);
        xbox.startGame(game);

        // task 4
//        StringBuilder stringBuilder = new StringBuilder();
//        int number1 = 3;
//        int number2 = 56;
//        stringBuilder.append(number1)
//                .append(" + ")
//                .append(number2)
//                .append(" = ")
//                .append(number1 + number2)
//                .append("\n");
//        stringBuilder.append(number1)
//                .append(" - ")
//                .append(number2)
//                .append(" = ")
//                .append(number1 - number2)
//                .append("\n");
//        stringBuilder.append(number1)
//                .append(" * ")
//                .append(number2)
//                .append(" = ")
//                .append(number1 * number2)
//                .append("\n");
//        System.out.println(stringBuilder);
//
//        int placeForEquals = stringBuilder.indexOf("=");
//
//        stringBuilder.deleteCharAt(placeForEquals);
//        stringBuilder.insert(placeForEquals, "равно");
//
//        placeForEquals = stringBuilder.indexOf("=");
//
//        stringBuilder.deleteCharAt(placeForEquals);
//        stringBuilder.replace(placeForEquals, placeForEquals, "равно");
//
//        System.out.println(stringBuilder);
    }
}