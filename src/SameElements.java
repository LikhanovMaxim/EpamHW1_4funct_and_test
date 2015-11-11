public class SameElements {
    static boolean sameElements(String[] mas) {
        if (mas == null) {
            return false;
        }
        boolean flag = false;
        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i].equals(mas[j])) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

}
