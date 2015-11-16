public class SameElements {
    static boolean sameElements(String[] arr) {
        if (arr == null) {
            return false;
        }
        boolean occurren = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    occurren = true;
                    break;
                }
            }
        }
        return occurren;
    }

}
