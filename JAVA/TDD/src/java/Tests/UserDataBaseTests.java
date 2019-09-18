import Login.UserDatabase;
import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserDataBaseTests {


    @Test
    public void testValidate() {
        assertTrue(UserDatabase.validate("root", "root"));
        assertTrue(UserDatabase.validate("admin", "123qweASD!"));
        assertTrue(UserDatabase.validate("student", "student"));
        assertFalse(UserDatabase.validate("Serafino", "123qweASD$!"));
    }

}