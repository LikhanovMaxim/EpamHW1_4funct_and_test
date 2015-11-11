public class Matrix {
    static void printMatrix(int[][] Matrix) {
        if (Matrix == null) {
            System.out.println("Matrix = null");
            return;
        }
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                System.out.print(Matrix[i][j] + " ");
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
        for (int i = 0; i < firstMatrix.length && flag; i++) {
            if (firstMatrix[i].length != secondMatrix[i].length) {
                flag = false;
                break;
            }
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]) {
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
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                sum = 0;
                for (int r = 0; r < secondMatrix.length; r++) {
                    sum += firstMatrix[i][r] * secondMatrix[r][j];
                }
                mulMatrix[i][j] = sum;
            }
        }
        return mulMatrix;
    }

}
