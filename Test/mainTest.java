import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {
    main test = new main();
    @Test
    void passwordIsGoodTrue() {
        String p = "Password1234!!";
        assertEquals(true, test.passwordIsGood(p));
    }

    @Test
    void passwordIsGoodFalse() {
        String p = "Password";
        assertEquals(true, test.passwordIsGood(p));
    }

    @Test
    void containsDigits() {
        String p = "1234";
        assertEquals(true, test.containsDigits(p));
    }

    @Test
    void containsDigitsFalse() {
        String p = "password";
        assertEquals(true, test.containsDigits(p));
    }

    @Test
    void containsUpLowCase() {
        String p = "Password";
        assertEquals(true, test.containsUpLowCase(p));
    }

    @Test
    void containsUpLowCaseFalse() {
        String p = "asdfgqrwe";
        assertEquals(true, test.containsUpLowCase(p));
    }

    @Test
    void hasSpecial() {
        String p = "asdf1!@";
        assertEquals(true, test.hasSpecial(p));
    }

    @Test
    void hasSpecialFalse() {
        String p = "fdsagjkl";
        assertEquals(true, test.hasSpecial(p));
    }
}