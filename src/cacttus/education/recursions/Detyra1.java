package cacttus.education.recursions;

public class Detyra1 {
    public static void printDesc(int number) {
        if (number < 1) return;
        System.out.println(number);
        printDesc(number - 1);
    }

    public static void printAsc(int number) {
        if (number < 1) return;
        printAsc(number - 1);
        System.out.println(number);
    }


    public static void collatz(int number) {
        System.out.printf("%d ", number);
        if (number == 1)
            return;
        else if (number % 2 == 0)
            collatz(number / 2);
        else collatz(number * 3 + 1);
    }

    public static void main(String[] args) {
        //printAsc(10);
        collatz(99);
    }
}




