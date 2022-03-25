import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void isPasswordValid_WhenLengthAndisDigitThan_shouldReturnTrue() {
        assertTrue(PasswordValidation.isPasswordValid("asfik9set"));
    }

    @Test
    void isPasswordValid_WhenLengthAndisDigitThan_shouldReturnFalse() {
        assertFalse(PasswordValidation.isPasswordValid("asfikset"));
    }

    @Test
    void checkLength_WhenMinLengthEightThan_shouldReturnTrue() {
        assertTrue(PasswordValidation.isPasswordValid("asfik9set"));
    }

    @Test
    void checkLength_WhenLengthEightThan_shouldReturnFalse() {
        assertFalse(PasswordValidation.isPasswordValid("asfik9"));
    }

    @Test
    void isDigit_WhenContainsMinOneDigitThan_shouldReturnTrue() {
        assertTrue(PasswordValidation.isPasswordValid("asfik9set"));
    }

    @Test
    void isDigit_WhenNoDigitThan_shouldReturnFalse() {
        assertFalse(PasswordValidation.isPasswordValid("asfiksfaset"));
    }


    @Test
    void checkPasswordQuality_whenContainsPatternThan_shouldReturnFalse() {

        String password = "kasAnajfa5safA3";
        String username = "Ana";
        String[] invalidPattern = new String[]{"123", username, (username + "123"), ("123" + username)};

        assertFalse(PasswordValidation.checkPasswordQuality(invalidPattern, password));
    }

    @Test
    void checkPasswordQuality_whenNoPatternThan_shouldReturnTrue() {

        String password = "kasjfaskjhafA3";
        String username = "Ana";
        String[] invalidPattern = new String[]{"123", username, (username + "123"), ("123" + username)};

        assertTrue(PasswordValidation.checkPasswordQuality(invalidPattern, password));
    }

    @Test
    void hasLowerLetter_WhenLowerLetterThan_ShouldReturnTrue() {
        String password = "kasjfaskjhafA3";
        assertTrue(PasswordValidation.hasLowerLetter(password));
    }

    @Test
    void hasLowerLetter_WhenNoLowerLetterThan_ShouldReturnFalse() {
        String password = "kasjfaskjhafA3";
        assertFalse(PasswordValidation.hasLowerLetter(password));
    }

    @Test
    void hasUpperLetter_WhenUpperLetterThan_ShouldReturnTrue() {
        String password = "kasjfaskjhafA3";
        assertTrue(PasswordValidation.hasUpperLetter(password));
    }
    @Test
    void hasUpperLetter_WhenNoUpperLetterThan_ShouldReturnFalse() {
        String password = "kasjfaskjhafA3";
        assertFalse(PasswordValidation.hasUpperLetter(password));
    }
}