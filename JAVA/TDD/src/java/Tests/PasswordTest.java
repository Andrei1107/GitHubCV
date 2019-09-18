import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import Login.Password;
import org.junit.Test;

public class PasswordTest {

    Password target = new Password("1234");

    @Test
    public void testConstructor() {
        assertNotNull(target);
    }

    @Test
    public void testGetKey() {
        assertNotNull(target.getKey());
        assertEquals("1234", target.getKey());
    }
}