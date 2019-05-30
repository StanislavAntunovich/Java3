package ru.geekbrains.lesson6;

import java.util.Arrays;

public class MainClass {

    public static int[] getAfterFour(int[] array) {
        if (array.length == 0) {
            throw new RuntimeException("Empty array");
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                return Arrays.copyOfRange(array, i + 1, array.length);
            }
        }

        throw new RuntimeException("No 4 in array");
    }

    public static boolean checkForOneAndFour(int[] array) {
        boolean found4 = false, found1 = false;
        for (int value : array) {
            if (value != 1 && value != 4) {
                return false;
            }

            if (value == 1) {
                found1 = true;
            }

            if (value == 4) {
                found4 = true;
            }
        }

        return found1 && found4;
    }
}
