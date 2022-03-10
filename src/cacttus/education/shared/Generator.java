package cacttus.education.shared;

import java.util.Arrays;

public class Generator {
    //maxValue is exluded
    public static int[] generateArray(int length, int minValue, int maxValue) {
        int[] array = new int[length]; //krijo vargun sa eshte gjatesia

        int i = 0;
        while (i < array.length) {
            array[i++] = (int) ((Math.random() * (maxValue - minValue)) + minValue);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}






