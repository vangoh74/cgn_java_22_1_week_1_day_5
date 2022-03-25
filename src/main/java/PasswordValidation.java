import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        // Invalid Passwords
        String[] strArr = new String[]{"123"};
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
        String username = "Ana";
        String[] invalidPattern = new String[]{"123", username, (username + "123"), ("123" + username)};

        for (char c : password.toCharArray()) {
            if (isDigit(c) && checkLength(password) && checkPasswordQuality(invalidPattern, password) && hasLowerLetter(password) && hasUpperLetter(password)) {
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

    public static boolean checkPasswordQuality(String[] invalidPattern, String pw) {
        for (String pattern : invalidPattern) {
            if (pw.contains(pattern)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasLowerLetter(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return true;
    }

    public static boolean hasUpperLetter(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return true;
    }


    public static String getPassword() {
        System.out.println("Bitte, geben Sie Ihr Password ein: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }


}

