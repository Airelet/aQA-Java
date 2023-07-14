package homework14;

import homework14.games.ScreenResolution;
import homework14.games.Tetris;
import homework14.inputDevices.KeyboardAndMouse;
import homework14.inputDevices.PSController;
import homework14.inputDevices.XboxController;
import homework14.platforms.PlayStation;
import homework14.platforms.Windows;
import homework14.platforms.Xbox;

import java.util.List;

import static homework14.games.ScreenResolution.*;

public class Main {
    public static void main(String[] args) {
        PSController psController = new PSController();
        XboxController xboxController = new XboxController();
        KeyboardAndMouse keyboardAndMouse = new KeyboardAndMouse();

        // task 1-3
        Windows windows = new Windows(valueOf("HD"), psController);
        Xbox xbox = new Xbox(toScreenResolution(1080), xboxController);
        PlayStation playStation = new PlayStation(FULL_HD, psController);

        Tetris tetris = new Tetris(List.of(windows, xbox));

        windows.startGame(tetris);
        System.out.println("------------------------------");
        playStation.startGame(tetris);
        System.out.println("------------------------------");
        xbox.setScreenResolution(ScreenResolution.P420);
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