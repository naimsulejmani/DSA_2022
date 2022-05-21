package cacttus.education.advanced_sort;

import cacttus.education.shared.Generator;
import cacttus.education.shared.Helper;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = {72, 54, 59, 30, 31, 45, 2, 77};
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Generator.printArray(array);
        shellSort(array);
        Generator.printArray(array);
    }
    public static void insertionSort(int[] array, int startIndex, int increment) {
        for (int i = startIndex; i < array.length; i += increment) {
            for (int j = Math.min(i + increment, array.length - 1); j - increment >= 0; j -= increment) {
                if (array[j] < array[j - increment])
                    Helper.swap(array, j, j - increment);
                else break;
                Generator.printArray(array);
            }
        }
    }
    public static void shellSort(int[] array) {
        int increment = array.length / 2; //random <= se sa array.length/2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertionSort(array, startIndex, increment);
            }
            increment /= 2;
        }
    }
}






