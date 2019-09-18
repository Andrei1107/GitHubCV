import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import Login.Password;
import Login.User;
import org.junit.Test;

public class UserTest {

    private User target = new User("Serafino", "123qweASD!");

    @Test
    public void testConstructor() {
        assertNotNull(target);
    }

    @Test
    public void testGetUsername() {
        assertNotNull(target.getUsername());
        assertEquals("Serafino", target.getUsername());
    }

    @Test
    public void testGetPassword() {
        Password targetPassword = new Password("123qweASD!");
        assertEquals(targetPassword.getKey(), target.getPassword().getKey());
    }
}