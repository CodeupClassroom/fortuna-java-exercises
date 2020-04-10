import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CodeupCryptTest {
    private CodeupCrypt codeupCrypt;

    @Before
    public void setUp() {
        codeupCrypt = new CodeupCrypt();
    }

    @Test
    public void testIfTheHashExist() {
        assertNotNull(CodeupCrypt.hash);
    }

    @Test
    public void testHashPassword() {
        String password = "Trant";
        String actual = codeupCrypt.hashPassword(password);
        assertEquals("Tr4nt", actual);
        assertEquals("Tr4nt", codeupCrypt.hash);
    }

    @Test
    public void testIfCheckPasswordWorks() {
        String password = "@Codeup78258";
        String hash = "@C0d39p78258";
        assertTrue("Testing checkPassword()", codeupCrypt.checkPassword(password, hash));
    }
}
