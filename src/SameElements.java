public class SameElements {
    static boolean sameElements(String[] mas) {
        if (mas == null) {
            return false;
        }
        boolean flag = false;
        for (int firstWord = 0; firstWord < mas.length; firstWord++) {
            for (int secondWord = firstWord + 1; secondWord < mas.length; secondWord++) {
                if (mas[firstWord].equals(mas[secondWord])) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

}
