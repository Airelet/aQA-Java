package homework12;

import homework12.games.Tetris;
import homework12.inputDevices.KeyboardAndMouse;
import homework12.inputDevices.PSController;
import homework12.inputDevices.XboxController;
import homework12.platforms.PlayStation;
import homework12.platforms.Windows;
import homework12.platforms.Xbox;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PSController psController = new PSController();
        XboxController xboxController = new XboxController();
        KeyboardAndMouse keyboardAndMouse = new KeyboardAndMouse();

        // task 1-3
        Windows windows = new Windows(720, psController);
        Xbox xbox = new Xbox(1080, xboxController);
        PlayStation playStation = new PlayStation(1080, psController);

        Tetris tetris = new Tetris(List.of(windows, xbox));


        windows.startGame(tetris);
        System.out.println("------------------------------");
        playStation.startGame(tetris);
        System.out.println("------------------------------");
        xbox.setScreenResolution(420);
        xbox.startGame(tetris);
        System.out.println("------------------------------");
        windows.setInputDevice(keyboardAndMouse);
        windows.startGame(tetris);
        System.out.println("------------------------------");
        windows.setInputDevice(xboxController);
        windows.startGame(tetris);
        System.out.println("------------------------------");
        playStation.setInputDevice(psController);
        System.out.println(playStation.getPlatformName() + " controls:");
        System.out.println(psController);
        System.out.println("------------------------------");
        System.out.println(playStation);
        System.out.println("------------------------------");
        System.out.println(tetris);


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