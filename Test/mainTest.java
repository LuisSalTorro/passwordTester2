import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void passwordIsGoodTest1() throws Exception{
        main test1 = new main();
        String pass = "Heyyall1";

        assertEquals(true, test1.passwordIsGood(pass));
    }

    @Test
    void digitsTest() throws Exception{
        main test2 = new main();
        String digit = "passworDS$";

        assertEquals(true,test2.containsDigits(digit));
    }

    @Test
    void upperLowerTest() throws Exception{
        main test2 = new main();
        String upper = "password45^";

        assertEquals(true,test2.containsUpLowCase(upper));
    }

    @Test
    void specialTest() throws Exception{
        main test2 = new main();
        String special = "NoSpecia7l";

        assertEquals(true,test2.hasSpecial(special));
    }

    @Test
    void passwordIsGoodTest2() throws Exception{
        main test1 = new main();
        String pass = "Heyyall";

        assertEquals(false, test1.passwordIsGood(pass));
    }

    @Test
    void digitsTest2() throws Exception{
        main test2 = new main();
        String digit = "password";

        assertEquals(false,test2.containsDigits(digit));
    }

    @Test
    void upperLowerTest2() throws Exception{
        main test2 = new main();
        String upper = "IWUWHAHD";

        assertEquals(false,test2.containsUpLowCase(upper));
    }

    @Test
    void specialTest2() throws Exception{
        main test2 = new main();
        String special = "NoSpecial";

        assertEquals(false,test2.hasSpecial(special));
    }

    @Test
    void lengthTest1() throws Exception{
        main test2 = new main();
        String special = "short";

        assertEquals(true,test2.hasSpecial(special));
    }

    @Test
    void lengthTest2() throws Exception{
        main test2 = new main();
        String special = "short";

        assertEquals(false,test2.length(special));
    }

}