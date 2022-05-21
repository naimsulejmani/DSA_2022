package cacttus.education.advanced_sort;

import cacttus.education.shared.Generator;
import cacttus.education.shared.Helper;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {72, 54, 59, 30, 31, 78, 2, 77, 82, 72};
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Generator.printArray(array);
        quickSort(array);
        Generator.printArray(array);
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int low, int height) {
        if (low >= height) return;

        int pivotIndex = partition(array, low, height);
        quickSort(array, low, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, height);
    }

    //low &  height i caktojne working part of array
    public static int partition(int[] array, int low, int height) {
        int pivot = array[low];
        int l = low;
        int h = height;
        while (l < h) {
            while (array[l] <= pivot && l < h) l++;
            while (array[h] > pivot) h--;
            if (l < h) Helper.swap(array, l, h);
        }
        Helper.swap(array, low, h);
        System.out.println("Pivot = " + pivot);
        Generator.printArray(array);
        return h;
    }
}
