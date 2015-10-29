import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectArraysTest {

    @Test
    public void testEntryElementArr() throws Exception {
        double[] mas1 = {1, 2, 3, 6, 4, 5, 1, 6, 7};
        assertTrue(IntersectArrays.entryElementArr(mas1, 2));
        assertTrue(IntersectArrays.entryElementArr(mas1, 1));
        assertTrue(IntersectArrays.entryElementArr(mas1, 6));
        assertTrue(IntersectArrays.entryElementArr(mas1, 7));

        assertFalse(IntersectArrays.entryElementArr(mas1, 8));
        assertFalse(IntersectArrays.entryElementArr(null, 1));
    }

    @Test(timeout = 1000)
    public void testIntersectArrays() throws Exception {
        double[] mas1 = {1, 2, 3, 4, 5};
        double[] mas2 = {6, 6.5, 1, 7, 8, 9, 3};
        double[] mas3 = {1, 3};
        double[] mas4 = {0, -20, 1, 1, 1, 3, 4, 3};
        double[] mas5 = {1, 3, 4};
        double[] mas6 = {7, 7, 7, 7, 7, 7, 7};
        double[] mas7 = {};
        assertTrue(IntersectArrays.equallyArray(mas1, IntersectArrays.intersectArrays(mas1, mas1)));
        assertTrue(IntersectArrays.equallyArray(mas3, IntersectArrays.intersectArrays(mas1, mas2)));
        assertTrue(IntersectArrays.equallyArray(mas5, IntersectArrays.intersectArrays(mas1, mas4)));
        assertTrue(IntersectArrays.equallyArray(mas7, IntersectArrays.intersectArrays(mas5, mas6)));
        assertTrue(IntersectArrays.equallyArray(mas7, IntersectArrays.intersectArrays(mas1, mas7)));
        assertTrue(IntersectArrays.equallyArray(null, IntersectArrays.intersectArrays(null, null)));
        assertFalse(IntersectArrays.equallyArray(mas3, IntersectArrays.intersectArrays(null, mas2)));
        assertFalse(IntersectArrays.equallyArray(mas3, IntersectArrays.intersectArrays(mas1, null)));
        assertFalse(IntersectArrays.equallyArray(mas1, IntersectArrays.intersectArrays(mas1, mas2)));
    }

    @Test
    public void testEquallyArray() throws Exception {
        double[] mas1 = {1, 2, 3, 6, 4, 5, 1, 6, 7};
        double[] mas2 = {1, 2, 3, 4, 5};
        double[] mas3 = {5, 4, 3, 2, 1};
        assertTrue(IntersectArrays.equallyArray(mas1, mas1));
        assertTrue(IntersectArrays.equallyArray(mas2, mas2));
        assertTrue(IntersectArrays.equallyArray(null, null));
        assertFalse(IntersectArrays.equallyArray(mas2, mas3));
        assertFalse(IntersectArrays.equallyArray(mas1, null));
        assertFalse(IntersectArrays.equallyArray(null, mas1));
    }
}