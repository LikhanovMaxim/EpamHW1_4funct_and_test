import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.*;

public class SameElementsTest {

    @Test
    public void testDifferWordsSameElements() throws Exception {
        String[] test = {"Vasja", "Misha", "Petr", "Anna"};
        assertFalse(SameElements.sameElements(test));
    }
    @Test
    public void testSameWordsSameElements() throws Exception {
        String[] test = {"Vasja", "Misha", "Petr", "Misha", "Anna"};
        assertTrue(SameElements.sameElements(test));
    }
    public void testNullSameElements() throws Exception {
        assertFalse(SameElements.sameElements(null));
    }
}