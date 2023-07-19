package homework15;

import homework15.exceptions.WrongLoginException;
import homework15.exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        try {
            LoginUtils.login("lo_ol", "Password_!", "Password_!");
            System.out.println("You have been successfully registered");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}