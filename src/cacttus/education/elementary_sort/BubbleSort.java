package cacttus.education.elementary_sort;

import cacttus.education.shared.Generator;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = Generator.generateArray(10, 1, 101);
        System.out.println("Vargu i pasortuar");
        Generator.printArray(array);
        bubbleSort(array);
        System.out.println("Vargu i sortuar");
        Generator.printArray(array);
    }

    public static void bubbleSort(int[] array) {
        for (int iPass = 1; iPass <= array.length - 1; iPass++) {
            for (int i = 0; i <= array.length - 2; i++) {
                //Krahaso elemtin e vargut ne pozitin i me elementin vijues i+1
                if (array[i] > array[i + 1]) {
                    int temp = array[i];//vendose ne varibael te perkohshme
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}








