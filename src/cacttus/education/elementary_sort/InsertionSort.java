package cacttus.education.elementary_sort;

import cacttus.education.shared.Generator;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = Generator.generateArray(10, 1, 101);
        System.out.println("Vargu i pasortuar");
        Generator.printArray(array);
        insertionSort(array);
        System.out.println("Vargu i sortuar");
        Generator.printArray(array);
    }

    public static void insertionSort(int[] array) {

        //shko ne poziten e dyte (pointer=1) deri tek i fundit
        for (int pointer = 1; pointer < array.length; pointer++) {
            int temp = array[pointer];
            int position = pointer;

            //perderisa nuk kemi mri ne fillim te vargut
            //dhe elementi paraprak eshte me i madh se temp (current)
            while (position > 0 && array[position - 1] > temp) {
                array[position] = array[position - 1];
                position--;
            }
            //vendose temp (current) ne poziten te cilen duhet te jete
            array[position] = temp;

            Generator.printArray(array);
        }
    }


}








