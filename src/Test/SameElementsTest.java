import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.*;

public class SameElementsTest {

    @Test
    public void testSameElements() throws Exception {
        String[] test1 = {"Vasja", "Misha", "Petr", "Anna"};
        assertFalse(SameElements.sameElements(test1));

        String[] test2 = {"Vasja", "Misha", "Petr", "Misha", "Anna"};
        assertTrue(SameElements.sameElements(test2));

        String[] test3 = {"Vlad", "Vlad", "Vlad"};
        assertTrue(SameElements.sameElements(test3));

        assertFalse(SameElements.sameElements(null));
    }
}