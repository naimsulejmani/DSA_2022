package cacttus.education.searches.detyrat;

import cacttus.education.shared.Generator;

public class DetyraMeKerkimLinear {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(indeksiVleres(array, 5));
        System.out.println(indeksiVleres(array, 9));
        System.out.println(shumaEVargut(new int[]{9, 10, 24, -1}));
        System.out.println(mesatarjaEVargut(new int[]{9, 10, 24, -1}));
        System.out.println(prodhimiINumraveTeVargut(new int[]{1, 5, 7}));
        array = Generator.generateArray(10, 5, 1005);
        Generator.printArray(array); //shtyp vargun
        System.out.println(minimalja(array));
        System.out.println(minimumValueOrIndexOfMinValue(array,true));
        System.out.println(minimumValueOrIndexOfMinValue(array,false));
    }

    //https://meet.jit.si/dsa_2022_oop
    static int indeksiVleres(int[] array, int vlera) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == vlera) {
                return i;
            }
        }
        return -1;
    }

    static int shumaEVargut(int[] vargu) {
        int sum = 0;

        for (int element : vargu) {
            sum += element;
        }
        return sum;
    }

    //kjo metoda pranon si mesazh nje varg
    //dhe kthen nje numer te plote e cila paraqet prodhimin
    //e secilit element ne varg
    // [1,5,7] => 1 * 5 * 7 = 35
    static int prodhimiINumraveTeVargut(int[] array) {
        int product = 1;
        for (int number : array) {
            product *= number;
        }
        return product;
    }

    static double mesatarjaEVargut(int[] array) {
        return shumaEVargut(array) / (double) array.length;
    }

    static int minimalja(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    static int minimumValueOrIndexOfMinValue(int[] array, boolean minValue) {
        int minimumValue = minimalja(array);
        return minValue ? minimumValue : indeksiVleres(array, minimumValue);
        //   return minValue ? minimalja(array) : indeksiVleres(array,minimalja(array));
    }


}









