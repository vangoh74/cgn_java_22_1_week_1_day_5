import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        String pw = getPassword();
        if (isPasswordValid(pw)) {
            System.out.println("Dein Passwort ist gültig!");
        }
        System.out.println("Passwort ist falsch!");
    }

    /* Conditions:
        #1 Min Length: 8
        #2 Contains
    * */
    public static boolean isPasswordValid(String password) {
        int minLength = 8;
        for (char c : password.toCharArray()) {

            if (isDigit(c) && checkLength(password)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkLength(String str) {
        int minLength = 8;
        if (str.length() >=  minLength) {
            return true;
        }
        return false;
    }

    public static boolean isDigit(char ch) {
        if (Character.isDigit(ch)) {
            return true;
        }
        return false;
    }

    public static String getPassword() {
        System.out.println("Bitte, geben Sie Ihr Password ein: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}

