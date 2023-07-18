package homework15;

import homework15.exceptions.WrongLoginException;
import homework15.exceptions.WrongPasswordException;

public class LoginUtils {
    public static boolean login(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        boolean validLogin = validateLogin(login);
        boolean validPassword = validatePassword(password, confirmPassword);
        return validLogin && validPassword;
    }

    private static boolean validateLogin(String login) throws WrongLoginException {
        if (!login.contains("_") ||
                login.length() >= 20) {
            throw new WrongLoginException("Login should contain underscore(_) and be less than 20 symbols");
        } else {
            return true;
        }
    }

    private static boolean validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.contains("_") ||
                !password.contains("!") ||
                password.length() >= 20 ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords should contain underscore(_), exclamation mark(!), " +
                    "be at less than symbols and match");
        } else {
            return true;
        }
    }
}
