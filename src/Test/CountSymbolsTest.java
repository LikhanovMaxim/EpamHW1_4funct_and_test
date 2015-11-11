import org.junit.Test;

import static org.junit.Assert.*;

public class CountSymbolsTest {

    @Test
    public void testEmptyTextCountSymbols() throws Exception {
        assertEquals(0, CountSymbols.countSymbols("", 'p'));
    }
    @Test
    public void testNullCountSymbols() throws Exception {
        assertEquals(0, CountSymbols.countSymbols(null, 'a'));
    }
    @Test
    public void testOccurenCountSymbols() throws Exception {
        assertEquals(3, CountSymbols.countSymbols("Epampmp", 'p'));
    }
    @Test
    public void testNoOccurenCountSymbols() throws Exception {
        assertEquals(0, CountSymbols.countSymbols("Test number 7", 'N'));
    }
}