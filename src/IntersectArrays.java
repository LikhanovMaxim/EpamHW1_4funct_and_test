import java.util.Arrays;

public class IntersectArrays {
    static boolean contains(double[] arr, double comparElem) {
        if (arr == null) {
            return false;
        }
        for (double element : arr) {
            if (element == comparElem) {
                return true;
            }
        }
        return false;
    }

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
            if (!contains(intersArrays, firstArray[i])) {
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
