package cacttus.education.searches;

public class BinarySearch {
    public static void main(String[] args) {
        int[] vargu = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int findIndex = kerkimiBinar(vargu, 11);
        System.out.println(findIndex);
    }

    static int kerkimiBinar(int[] array, int value) {
        int low, mid, high;
        low = 0;
        high = array.length - 1;
        while (low <= high) {
            //Mesin e gjejm ne PARIS
            mid = (low + high) / 2;

            //pyetja e pare eshte AJETI!?
            if (array[mid] == value) {
                return mid;
            }

            if (value < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        //kthe -minus 1 kur nuk gjindet mesi ne loje sikurse ndaj Realit :)
        return -1;
    }
}












