package homework7;

import java.util.Scanner;

public class InputHandler {
    public static int getInt(Scanner scanner) {
        return scanner.nextInt();
    }

    public static char getOperation(Scanner scanner) {
        return scanner.next().charAt(0);
    }
}
