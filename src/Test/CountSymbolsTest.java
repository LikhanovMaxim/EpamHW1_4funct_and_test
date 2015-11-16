import org.junit.Test;

import static org.junit.Assert.*;

public class CountSymbolsTest {

    @Test
    public void EmptyTextCountSymbols() throws Exception {
        assertEquals(0, CountSymbols.countSymbols("", 'p'));
    }
    @Test
    public void NullCountSymbols() throws Exception {
        assertEquals(0, CountSymbols.countSymbols(null, 'a'));
    }
    @Test
    public void OccurenCountSymbols() throws Exception {
        assertEquals(3, CountSymbols.countSymbols("Epampmp", 'p'));
    }
    @Test
    public void NoOccurenCountSymbols() throws Exception {
        assertEquals(0, CountSymbols.countSymbols("Test number 7", 'N'));
    }
}