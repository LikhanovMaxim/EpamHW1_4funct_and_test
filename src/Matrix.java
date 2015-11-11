public class Matrix {
    static void printMatrix(int[][] Matrix) {
        if (Matrix == null) {
            System.out.println("Matrix = null");
            return;
        }
        for (int rows = 0; rows < Matrix.length; rows++) {
            for (int columns = 0; columns < Matrix[0].length; columns++) {
                System.out.print(Matrix[rows][columns] + " ");
            }
            System.out.println();
        }
    }
    static boolean equallyMatix(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix == null && secondMatrix == null) {
            return true;
        }
        if (firstMatrix == null || secondMatrix == null) {
            return false;
        }
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        if (firstMatrix == null || secondMatrix == null) {
            return false;
        }
        boolean flag;
        flag = true;
        for (int rows = 0; rows < firstMatrix.length && flag; rows++) {
            if (firstMatrix[rows].length != secondMatrix[rows].length) {
                flag = false;
                break;
            }
            for (int columns = 0; columns < firstMatrix[rows].length; columns++) {
                if (firstMatrix[rows][columns] != secondMatrix[rows][columns]) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    static int[][] multiplMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix == null || secondMatrix == null) {
            return null;
        }
        if (firstMatrix[0].length != secondMatrix.length) {
            return null;
        }
        int sum;
        int[][] mulMatrix;
        mulMatrix = new int[firstMatrix[0].length][secondMatrix[0].length];
        for (int rows = 0; rows < firstMatrix.length; rows++) {
            for (int columns = 0; columns < secondMatrix[0].length; columns++) {
                sum = 0;
                for (int r = 0; r < secondMatrix.length; r++) {
                    sum += firstMatrix[rows][r] * secondMatrix[r][columns];
                }
                mulMatrix[rows][columns] = sum;
            }
        }
        return mulMatrix;
    }
}
