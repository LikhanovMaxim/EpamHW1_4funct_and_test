import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test(timeout = 1000)
    public void DifferDimenMultiplMatrix() throws Exception {
        int[][] matA = {{-2, 1},
                         {5, 4}};
        int[][] matB = {{3},
                       {-1}};
        int[][] matAB = {{-7},
                         {11}};
        assertTrue(Matrix.equallyMatix(matAB, Matrix.multiplMatrix(matA, matB)));
        assertFalse(Matrix.equallyMatix(matAB, Matrix.multiplMatrix(matB, matA)));
    }
    @Test(timeout = 1000)
    public void SameDimenMultiplMatrix() throws Exception {
        int[][] matA = {{2, -3},
                        {4, -6}};
        int[][] matB = {{9, -6},
                        {6, -4}};
        int[][] matAB = {{0, 0},
                         {0, 0}};
        assertTrue(Matrix.equallyMatix(matAB, Matrix.multiplMatrix(matA, matB)));
        assertFalse(Matrix.equallyMatix(matAB, Matrix.multiplMatrix(matB, matA)));
    }
    @Test(timeout = 1000)
    public void NullMultiplMatrix() throws Exception {
        int[][] matA = {{-2, 1},
                         {5, 4}};
        assertTrue(Matrix.equallyMatix(null, Matrix.multiplMatrix(null, matA)));
        assertTrue(Matrix.equallyMatix(null, Matrix.multiplMatrix(matA, null)));
        assertTrue(Matrix.equallyMatix(null, Matrix.multiplMatrix(null, null)));
    }
    @Test
    public void NullEquallyMatix() throws Exception {
        assertTrue(Matrix.equallyMatix(null, null));
    }
    @Test
    public void EmptyEquallyMatix() throws Exception {
        int[][] mat={};
        assertTrue(Matrix.equallyMatix(mat, mat));
    }
    @Test
    public void ReflexEquallyMatix() throws Exception {
        int[][] matA = {{5, 8, -4},
                        {6, 9, -5},
                        {4, 7, -3}};
        assertTrue(Matrix.equallyMatix(matA, matA));
    }
    @Test
    public void DifferDimenEquallyMatix() throws Exception {
        int[][] matA = {{-2, 1},
                        {5, 4}};
        int[][] matB = {{3},
                       {-1}};
        assertFalse(Matrix.equallyMatix(matA, matB));
        assertFalse(Matrix.equallyMatix(matB, matA));
    }
    @Test
    public void SameDimenEquallyMatix() throws Exception {
        int[][] matA2 = {{5, 8, -4},
                         {6, 9, -5},
                         {4, 7, -3}};
        int[][] matB2 = {{3, 2, 5},
                         {4, -1, 3},
                         {9, 6, 5}};
        assertFalse(Matrix.equallyMatix(matA2, matB2));
        assertFalse(Matrix.equallyMatix(matB2, matA2));
    }
}