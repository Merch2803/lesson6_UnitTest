package ru.geekbrains;

import java.util.ArrayList;

public class MathUtils {

    private MathUtils() {

    }

    public static boolean[] checkHasFourOrOneInArray(int[] array) {

        for (Integer integer : array) {
            if (integer == 4 || integer == 1) {
                return new boolean[]{true};
            }
        }
        return new boolean[]{false};
    }


    public static int[] outputElementsAfterLastFour(int[] array) {

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        boolean hasFour = false;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                hasFour = true;
                break;
            }
            arrayList2.add(array[i]);
        }
        if (hasFour) {

            int[] returnedArray = new int[arrayList2.size()];
            int j = 0;
            for (int i = arrayList2.size() - 1; i >= 0; i--) {
                returnedArray[j] = arrayList2.get(i);
                j++;
            }

            return returnedArray;
        }
        throw new RuntimeException("Arraylist does not have element '4'!");
    }
}
