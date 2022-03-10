package cacttus.education.searches;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] vargu = {9, 19, -87, 16, 77, 14, 32, 100, 90, 88, 44, 12};
        boolean exists = aEkzistonVleraNeVarg(vargu, 88);
        System.out.println(exists);
    }

    //metoda e cila kontrollon se nje vlere a gjindet ne varg
    //duke perdore kerkimin sekuencial apo linear
    static boolean aEkzistonVleraNeVarg(int[] vargu, int vlera) {
        int index = 0;
        while (index < vargu.length) {
            if (vargu[index++] == vlera) return true;
            // index++;
        }
        return false;
    }
}
