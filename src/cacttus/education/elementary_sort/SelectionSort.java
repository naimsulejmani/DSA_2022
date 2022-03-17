package cacttus.education.elementary_sort;

import cacttus.education.shared.Generator;
import cacttus.education.shared.Helper;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = Generator.generateArray(10, 1, 101);
        System.out.println("Vargu i pasortuar: ");
        Generator.printArray(array);
        //     selectionSort(array);
        procedureSelectionSort(array);
        System.out.println("Vargu i sortuar: ");
        Generator.printArray(array);
    }

    public static int minValueIndex(int[] array, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = minValueIndex(array, i);

            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void procedureSelectionSort(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i; //supozojme se elementi ne poziten i eshte minimum
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            if (min != i) {
                Helper.swap(array, min, i);
            }
        }


    }


}





