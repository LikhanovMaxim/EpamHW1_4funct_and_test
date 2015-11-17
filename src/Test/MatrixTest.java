import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test(timeout = 1000)
    public void DifferDimenMultipl() throws Exception {
        int[][] matA = {{-2, 1},
                {5, 4}};
        int[][] matB = {{3},
                {-1}};
        int[][] matAB = {{-7},
                {11}};
        assertTrue(Matrix.equally(matAB, Matrix.multipl(matA, matB)));
        assertFalse(Matrix.equally(matAB, Matrix.multipl(matB, matA)));
    }

    @Test(timeout = 1000)
    public void SameDimenMultipl() throws Exception {
        int[][] matA = {{2, -3},
                {4, -6}};
        int[][] matB = {{9, -6},
                {6, -4}};
        int[][] matAB = {{0, 0},
                {0, 0}};
        assertTrue(Matrix.equally(matAB, Matrix.multipl(matA, matB)));
        assertFalse(Matrix.equally(matAB, Matrix.multipl(matB, matA)));
    }

    @Test(timeout = 1000)
    public void NullMultipl() throws Exception {
        int[][] matA = {{-2, 1},
                {5, 4}};
        int[][] emptyMat = {{}};
        assertTrue(Matrix.equally(emptyMat, Matrix.multipl(null, matA)));
        assertTrue(Matrix.equally(emptyMat, Matrix.multipl(matA, null)));
        assertTrue(Matrix.equally(emptyMat, Matrix.multipl(null, null)));
    }

    @Test
    public void NullEqually() throws Exception {
        assertTrue(Matrix.equally(null, null));
    }

    @Test
    public void EmptyEqually() throws Exception {
        int[][] mat = {};
        assertTrue(Matrix.equally(mat, mat));
    }

    @Test
    public void ReflexEqually() throws Exception {
        int[][] matA = {{5, 8, -4},
                {6, 9, -5},
                {4, 7, -3}};
        assertTrue(Matrix.equally(matA, matA));
    }

    @Test
    public void DifferDimenEqually() throws Exception {
        int[][] matA = {{-2, 1},
                {5, 4}};
        int[][] matB = {{3},
                {-1}};
        assertFalse(Matrix.equally(matA, matB));
        assertFalse(Matrix.equally(matB, matA));
    }

    @Test
    public void SameDimenEqually() throws Exception {
        int[][] matA2 = {{5, 8, -4},
                {6, 9, -5},
                {4, 7, -3}};
        int[][] matB2 = {{3, 2, 5},
                {4, -1, 3},
                {9, 6, 5}};
        assertFalse(Matrix.equally(matA2, matB2));
        assertFalse(Matrix.equally(matB2, matA2));
    }
}