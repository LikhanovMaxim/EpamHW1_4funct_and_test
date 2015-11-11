import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectArraysTest {

    @Test
    public void testFirstElemEntryElementArr() throws Exception {
        double[] mas = {1, 2, 3, 6, 4, 5, 1, 6, 7};
        assertTrue(IntersectArrays.entryElementArr(mas, 1));
    }

    @Test
    public void testMidleElemEntryElementArr() throws Exception {
        double[] mas = {1, 2, 3, 6, 4, 5, 1, 6, 7};
        assertTrue(IntersectArrays.entryElementArr(mas, 6));
    }

    @Test
    public void testEndElemEntryElementArr() throws Exception {
        double[] mas = {1, 2, 3, 6, 4, 5, 1, 6, 7};
        assertTrue(IntersectArrays.entryElementArr(mas, 7));
    }

    @Test
    public void testNoOccurEntryElementArr() throws Exception {
        double[] mas = {1, 2, 3, 6, 4, 5, 1, 6, 7};
        assertFalse(IntersectArrays.entryElementArr(mas, 8));
    }

    @Test
    public void testNullEntryElementArr() throws Exception {
        assertFalse(IntersectArrays.entryElementArr(null, 1));
    }

    @Test
    public void testNullEquallyArray() throws Exception {
        double[] mas1 = {1, 2, 3, 6, 4, 5, 1, 6, 7};
        assertTrue(IntersectArrays.equallyArray(null, null));
        assertFalse(IntersectArrays.equallyArray(mas1, null));
    }

    @Test
    public void testEmptyEquallyArray() throws Exception {
        double[] mas1 = {};
        assertTrue(IntersectArrays.equallyArray(mas1, mas1));
    }

    @Test
    public void testReflexEquallyArray() throws Exception {
        double[] mas1 = {1, 2, 3, 6, 4, 5, 1, 6, 7};
        assertTrue(IntersectArrays.equallyArray(mas1, mas1));
    }

    @Test
    public void testDifferArrEquallyArray() throws Exception {
        double[] mas2 = {1, 2, 3, 4, 5};
        double[] mas3 = {5, 4, 3, 2, 1};
        assertFalse(IntersectArrays.equallyArray(mas2, mas3));
    }

    @Test(timeout = 1000)
    public void testReflexIntersectArrays() throws Exception {
        double[] mas1 = {1, 2, 3, 4, 5};
        assertTrue(IntersectArrays.equallyArray(mas1, IntersectArrays.intersectArrays(mas1, mas1)));
    }
    @Test(timeout = 1000)
    public void testDifferArrIntersectArrays() throws Exception {
        double[] mas1 = {1, 2, 3, 4, 5};
        double[] mas2 = {6, 6.5, 1, 7, 8, 9, 3};
        double[] mas3 = {1, 3};
        assertTrue(IntersectArrays.equallyArray(mas3, IntersectArrays.intersectArrays(mas1, mas2)));
    }
    @Test(timeout = 1000)
    public void testNoMatchIntersectArrays() throws Exception {
        double[] mas1 = {1, 3, 4};
        double[] mas2 = {7, 7, 7, 7, 7, 7, 7};
        double[] mas3 = {};
        assertTrue(IntersectArrays.equallyArray(mas3, IntersectArrays.intersectArrays(mas1, mas2)));
    }
    @Test(timeout = 1000)
    public void testNullIntersectArrays() throws Exception {
        double[] mas1 = {1, 3, 4};
        assertTrue(IntersectArrays.equallyArray(null, IntersectArrays.intersectArrays(null, null)));
        assertFalse(IntersectArrays.equallyArray(mas1, IntersectArrays.intersectArrays(null, mas1)));
        assertFalse(IntersectArrays.equallyArray(mas1, IntersectArrays.intersectArrays(mas1, null)));
    }


}