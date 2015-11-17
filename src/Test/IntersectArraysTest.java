import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class IntersectArraysTest {

    @Test
    public void FirstElemEntryElement() throws Exception {
        double[] arr = {1, 2, 3, 6, 4, 5, 1, 6, 7};
        assertTrue(IntersectArrays.containsElement(arr, 1));
    }

    @Test
    public void MidleElemEntryElement() throws Exception {
        double[] arr = {1, 2, 3, 6, 4, 5, 1, 6, 7};
        assertTrue(IntersectArrays.containsElement(arr, 6));
    }

    @Test
    public void EndElemEntryElement() throws Exception {
        double[] arr = {1, 2, 3, 6, 4, 5, 1, 6, 7};
        assertTrue(IntersectArrays.containsElement(arr, 7));
    }

    @Test
    public void NoOccurEntryElement() throws Exception {
        double[] arr = {1, 2, 3, 6, 4, 5, 1, 6, 7};
        assertFalse(IntersectArrays.containsElement(arr, 8));
    }

    @Test
    public void NullEntryElement() throws Exception {
        assertFalse(IntersectArrays.containsElement(null, 1));
    }


    @Test
    public void ReflexIntersectArrays() throws Exception {
        double[] arr1 = {1, 2, 3, 4, 5};
        assertTrue(Arrays.equals(arr1, IntersectArrays.intersectArrays(arr1, arr1)));
    }

    @Test
    public void DifferArrIntersectArrays() throws Exception {
        double[] arr1 = {1, 2, 3, 4, 5};
        double[] arr2 = {6, 6.5, 1, 7, 8, 9, 3};
        double[] result = {1, 3};
        assertTrue(Arrays.equals(result, IntersectArrays.intersectArrays(arr1, arr2)));
    }

    @Test
    public void NoMatchIntersectArrays() throws Exception {
        double[] arr1 = {1, 3, 4};
        double[] arr2 = {7, 7, 7, 7, 7, 7, 7};
        double[] result = {};
        assertTrue(Arrays.equals(result, IntersectArrays.intersectArrays(arr1, arr2)));
    }

    @Test
    public void testNullIntersectArrays() throws Exception {
        double[] arr1 = {1, 3, 4};
        double[] result = {};
        assertTrue(Arrays.equals(result, IntersectArrays.intersectArrays(null, null)));
        assertFalse(Arrays.equals(arr1, IntersectArrays.intersectArrays(null, arr1)));
        assertFalse(Arrays.equals(arr1, IntersectArrays.intersectArrays(arr1, null)));
    }

//    @Test
//    public void NullEquallyArray() throws Exception {
//        double[] arr1 = {1, 2, 3, 6, 4, 5, 1, 6, 7};
//        assertTrue(IntersectArrays.equallyArray(null, null));
//        assertFalse(IntersectArrays.equallyArray(arr1, null));
//    }
//
//    @Test
//    public void EmptyEquallyArray() throws Exception {
//        double[] arr1 = {};
//        assertTrue(IntersectArrays.equallyArray(arr1, arr1));
//    }
//
//    @Test
//    public void ReflexEquallyArray() throws Exception {
//        double[] arr1 = {1, 2, 3, 6, 4, 5, 1, 6, 7};
//        assertTrue(IntersectArrays.equallyArray(arr1, arr1));
//    }
//
//    @Test
//    public void DifferArrEquallyArray() throws Exception {
//        double[] arr2 = {1, 2, 3, 4, 5};
//        double[] arr3 = {5, 4, 3, 2, 1};
//        assertFalse(IntersectArrays.equallyArray(arr2, arr3));
//    }
}