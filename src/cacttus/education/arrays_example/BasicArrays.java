package cacttus.education.arrays_example;

public class BasicArrays {
    public static void main(String[] args) {
        //Deklarimi i vargjeve, krijimi dhe inicializimi
        String[] names = new String[20]; //deklaro dhe krijo vargun me 20 elemente
        float[] pagat = new float[30];

        //vendosja e vlerave
        //names[20] = "Filan"; //IndexOutOfBoundException
        names[19] = "Fistek";
        pagat[19] = 431.19f;

        //leximi i vlerave
        System.out.println(names[19]);
        System.out.println(pagat[19]);
        System.out.println(names[18]);
        System.out.println(pagat[18]);

        //deklarimi i matrices
        int[][] array2D = new int[10][3];
        int[][] array2D1 = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        array2D1 = new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        //vendosja e vlerave ne matric
        array2D[0][1] = 10;
        array2D[2][2] = 20;

        //leximi vlerave
        System.out.println(array2D[0][1]);
        System.out.println(array2D[2][2]);
        System.out.println(array2D[3][2]);

        //deklarimi i jagged array
        int[][] jagged2D = new int[3][];
        jagged2D[0] = new int[5];
        jagged2D[1] = new int[3];
        jagged2D[2] = new int[]{1, 2, 3, 4};


        System.out.println("----------------");
        print2DArrays(array2D1);
        System.out.println("----------------");
        print2DArrays(jagged2D);
        System.out.println("----------------");
    }

    private static void print2DArrays(int[][] array2D) {
        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {
                System.out.printf("%5d", array2D[row][col]);
            }
            System.out.println();
        }
    }
}






