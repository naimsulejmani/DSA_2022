package cacttus.education.advanced_sort;

import cacttus.education.shared.Generator;
import cacttus.education.shared.Helper;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {72, 54, 59, 30, 31, 45, 2, 77};
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Generator.printArray(array); //shtyp vargun e pasortuar
        mergeSort(array);
        Generator.printArray(array);//shtyp vargun e sortuar
    }
    public static void mergeSort(int[] array) {
        mergeSort(array, array.length);
    }

    //ka me pranu si pamrameter vargun e pasortuar dhe numrin e elemtenve ne vargun e dhene
    public static void mergeSort(int[] array, int n) {
        if (n < 2) {
            //rasti baze
            //skemi cka me ba divide (nda) per shkak se vargu me 1 elemente vetemse eshte i sortuar
            return;
        }
        int middle = n / 2;
        //gjej mesin, dhe ndaj vargun
        int[] leftArray = new int[middle];
        int[] rightArray = new int[n - middle];
        //plotesojme vargjet prej vargut orgjinal array
        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }
        for (int i = middle; i < n; i++) {
            rightArray[i - middle] = array[i];
        }
//menyra tjeter per me insertuar ne anen e djatht te vargut
//        for (int i = 0; i < n - middle; i++) {
//            rightArray[i] = array[i + middle];
//        }
        //provo te ndasßh anen e majt te vargut ne dy pjese
        mergeSort(leftArray, middle);
        //provo te ndash anen e djatht te vargut ne dy pjese
        mergeSort(rightArray, n - middle);
//bashko elementen e vargut prej si jan kthy prej stack-ut
        merge(array, leftArray, rightArray);
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftIndex = 0;
        int rightIndex = 0;
        int index = 0;
        //perderisa indexi i anes se majte eshte me i vogel se gjatesia e vargut te majte dhe
        //indexi i anes se djatht eshte me i vogel se gjatsia e vargut te djatht atehere
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[index++] = leftArray[leftIndex++];
//                index++;
//                leftIndex++;
            } else {
                array[index++] = rightArray[rightIndex++];
            }
        }
        //nese u mbet dicka nga ana e majt pa u insertuar vendose ne varg te sortuar
        while (leftIndex < leftArray.length) {
            array[index++] = leftArray[leftIndex++];
        }

        //nese u mbet dicka nga ana e djatht pa u insertuar vendose ne varg te sortuar
        while (rightIndex < rightArray.length) {
            array[index++] = rightArray[rightIndex++];
        }
    }
}
