public class Matrix {

    static boolean equally(int[][] firstMatrix, int[][] secondMatrix) {
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

    static int[] getColumn(int[][] Matrix, int column) {
        int[] columnToMas = new int[Matrix.length];
        for (int i = 0; i < Matrix.length; i++) {
            columnToMas[i] = Matrix[i][column];
        }
        return columnToMas;
    }

    static int mulRowColumn(int[] firstMas, int[] secondMas) {
        int sum = 0;
        for (int i = 0; i < firstMas.length; i++) {
            sum += firstMas[i] * secondMas[i];
        }
        return sum;
    }

    static int[][] multipl(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix == null || secondMatrix == null) {
            int[][] emptyMat = {{}};
            return emptyMat;
        }
        if (firstMatrix[0].length != secondMatrix.length) {
            int[][] emptyMat = {{}};
            return emptyMat;
        }
        int[][] mulMatrix;
        mulMatrix = new int[firstMatrix[0].length][secondMatrix[0].length];
        for (int rows = 0; rows < firstMatrix.length; rows++) {
            for (int columns = 0; columns < secondMatrix[0].length; columns++) {
                int sum = mulRowColumn(firstMatrix[rows], getColumn(secondMatrix, columns));
                mulMatrix[rows][columns] = sum;
            }
        }
        return mulMatrix;
    }
}
