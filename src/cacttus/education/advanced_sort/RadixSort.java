package cacttus.education.advanced_sort;

import cacttus.education.shared.Generator;

public class RadixSort {
    public static void main(String[] args) {
        int[] array = {98, 76, 14, 22, 15, 9, 99, 192, 83, 66};
        Generator.printArray(array);
        radixSort(array);
        Generator.printArray(array);
    }

    public static void radixSort(int[] array) {
        int max = maxNumber(array);

        //i = exponenta
        for (int i = 1; max / i > 0; i *= 10) {
            countSort(array, i);
            //Generator.printArray(array);
        }
    }

    public static int maxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }

    //sorti me count sipas bazes (exponentit)
    public static void countSort(int[] array, int exponent) {
        int[] output = new int[array.length]; //vargu i sortuar ne baze te shifrave
        int[] count = new int[10];

        for (int i = 0; i < array.length; i++) {
            int countIndex = (array[i] / 10) % 10; //me marr shifren e fundit!
            count[countIndex]++;
        }

        //hapi i rradhes eshe me i be summary
        for (int i = 1; i < array.length; i++) {
            count[i] = count[i - 1] + count[i];
        }

        // me i vendose ne output
        for (int i = array.length - 1; i >= 0; i--) {
            int countIndex = (array[i] / 10) % 10; //merr shifren e fundit
            count[countIndex]--;
            output[count[countIndex]] = array[i];
        }

        //mbishkruje vargun orgjinal
        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }
}














