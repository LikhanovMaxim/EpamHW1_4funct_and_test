public class IntersectArrays {
    static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    static boolean entryElementArr(double[] mas, double comparElem) {
        if(mas==null){
            return false;
        }
        boolean flag;
        flag = false;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == comparElem) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    static boolean equallyArray(double[] firstArray, double[] secondArray) {
        if (firstArray == null && secondArray == null) {
            return true;
        }
        if (firstArray == null || secondArray == null) {
            return false;
        }
        if (firstArray.length != secondArray.length) {
            return false;
        }
        boolean flag;
        flag = true;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    static int selectionMin(int firstNum, int secondNum){
        if(firstNum<secondNum){
            return firstNum;
        }else {
            return secondNum;
        }
    }
    static double[] intersectArrays(double[] firstArray, double[] secondArray) {
        if (firstArray == null || secondArray == null) {
            return null;
        }
        double[] intersArrays;
        int dimension=selectionMin(firstArray.length, secondArray.length);
        intersArrays=new double[dimension];
        int dimensInterArr;
        dimensInterArr = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (!entryElementArr(intersArrays, firstArray[i])) {
                for (int j = 0; j < secondArray.length; j++) {
                    if (firstArray[i] == secondArray[j]) {
                        intersArrays[dimensInterArr] = firstArray[i];
                        dimensInterArr++;
                        break;
                    }
                }
            }
        }
        double[] optimizeInters;
        optimizeInters = new double[dimensInterArr];
        for (int i = 0; i < dimensInterArr; i++) {
            optimizeInters[i] = intersArrays[i];
        }
        return optimizeInters;
    }

}
