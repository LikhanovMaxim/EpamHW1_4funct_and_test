import org.junit.Test;

import static org.junit.Assert.*;

public class CountSymbolsTest {

    @Test
    public void testCountSymbols() throws Exception {
        assertEquals(0, CountSymbols.countSymbols("", 'p'));
        assertEquals(1, CountSymbols.countSymbols("Epam", 'p'));
        assertEquals(3, CountSymbols.countSymbols("Epampmp", 'p'));
        assertEquals(2, CountSymbols.countSymbols("addddddda", 'a'));
        assertEquals(0, CountSymbols.countSymbols(null, 'a'));
        assertEquals(0, CountSymbols.countSymbols("Test number 6", 'f'));
        assertEquals(0, CountSymbols.countSymbols("Test number 7", 'N'));
    }
}