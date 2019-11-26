package geco;

import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class UserTest {

    @Test
    public void testAl() {
        User test = new User();
        for (int i = 0; i < 10; i++) {
            String toReturn = test.getRandomPassword();
            assertNotEquals("azertyui", toReturn);
        }
    }

}
