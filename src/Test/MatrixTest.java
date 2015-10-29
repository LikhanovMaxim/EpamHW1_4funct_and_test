import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test(timeout = 1000)
    public void testMultiplMatrix() throws Exception {
        int[][] matA = {{-2, 1},
                {5, 4}};
        int[][] matB = {{3},
                {-1}};
        int[][] matAB = {{-7},
                {11}};
        assertTrue(Matrix.equallyMatix(matAB, Matrix.multiplMatrix(matA, matB)));
        assertFalse(Matrix.equallyMatix(matAB, Matrix.multiplMatrix(matB, matA)));
        int[][] matA1 = {{2, -3},
                {4, -6}};
        int[][] matB1 = {{9, -6},
                {6, -4}};
        int[][] matAB1 = {{0, 0},
                {0, 0}};
        assertTrue(Matrix.equallyMatix(matAB1, Matrix.multiplMatrix(matA1, matB1)));
        assertFalse(Matrix.equallyMatix(matAB1, Matrix.multiplMatrix(matB1, matA1)));
        int[][] matA2 = {{5, 8, -4},
                {6, 9, -5},
                {4, 7, -3}};
        int[][] matB2 = {{3, 2, 5},
                {4, -1, 3},
                {9, 6, 5}};
        int[][] matAB2 = {{11, -22, 29},
                {9, -27, 32},
                {13, -17, 26}};
        assertTrue(Matrix.equallyMatix(matAB2, Matrix.multiplMatrix(matA2, matB2)));
        assertFalse(Matrix.equallyMatix(matAB2, Matrix.multiplMatrix(matB2, matA2)));
        assertTrue(Matrix.equallyMatix(null, Matrix.multiplMatrix(null, matA)));
        assertTrue(Matrix.equallyMatix(null, Matrix.multiplMatrix(matA, null)));
        assertTrue(Matrix.equallyMatix(null, Matrix.multiplMatrix(null, null)));
        assertTrue(Matrix.equallyMatix(null, Matrix.multiplMatrix(matAB2, matA)));
    }

    @Test
    public void testEquallyMatix() throws Exception {
        int[][] matA = {{-2, 1},
                {5, 4}};
        int[][] matB = {{3},
                {-1}};
        assertTrue(Matrix.equallyMatix(null, null));
        assertTrue(Matrix.equallyMatix(matA,matA));
        assertFalse(Matrix.equallyMatix(matA, matB));
        assertFalse(Matrix.equallyMatix(matB, matA));
        assertFalse(Matrix.equallyMatix(null, matB));
        assertFalse(Matrix.equallyMatix(matA, null));
        int[][] matA2 = {{5, 8, -4},
                {6, 9, -5},
                {4, 7, -3}};
        int[][] matB2 = {{3, 2, 5},
                {4, -1, 3},
                {9, 6, 5}};
        assertTrue(Matrix.equallyMatix(matA2, matA2));
        assertFalse(Matrix.equallyMatix(matA2, matB2));
        assertFalse(Matrix.equallyMatix(matB2, matA2));
    }
}