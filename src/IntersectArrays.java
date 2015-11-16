import java.util.Arrays;

public class IntersectArrays {
    static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static boolean containsElementArr(double[] arr, double comparElem) {
        if (arr == null) {
            return false;
        }
//        for (double element: arr) {
//            if (arr[element]== comparElem) {
//                return true;
//            }
//        }
        for (int element = 0; element < arr.length; element++) {
            if (arr[element] == comparElem) {
                return true;
            }
        }
        return false;
    }

//    static boolean equallyArray(double[] firstArray, double[] secondArray) {
//        if (firstArray == null && secondArray == null) {
//            return true;
//        }
//        if (firstArray == null || secondArray == null) {
//            return false;
//        }
//        if (firstArray.length != secondArray.length) {
//            return false;
//        }
//        boolean flag;
//        flag = true;
//        for (int i = 0; i < firstArray.length; i++) {
//            if (firstArray[i] != secondArray[i]) {
//                flag = false;
//                break;
//            }
//        }
//        return flag;
//    }

    static double[] intersectArrays(double[] firstArray, double[] secondArray) {
        if (firstArray == null || secondArray == null) {
            double[] emptyArr = {};
            return emptyArr;
        }
        double[] intersArrays;
        int dimension = Math.min(firstArray.length, secondArray.length);
        intersArrays = new double[dimension];
        int dimensInterArr;
        dimensInterArr = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (!containsElementArr(intersArrays, firstArray[i])) {
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
        optimizeInters = Arrays.copyOf(intersArrays, dimensInterArr);
        return optimizeInters;
    }

}
