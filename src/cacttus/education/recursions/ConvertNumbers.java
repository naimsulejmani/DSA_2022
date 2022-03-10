package cacttus.education.recursions;

public class ConvertNumbers {
    public static String convertToBinary(int number) {
        //kontrollo per rastin baze
        if (number == 1) return "1";
        //perndryshe redukto
        return convertToBinary(number / 2) + (number % 2);
    }

    public static void main(String[] args) {
        System.out.println(convertToBinary(17));
        System.out.println(convertToBinary(127));
        System.out.println(factorial(5));
    }

    public static long factorial(int number) {
        //rasti baze kur number 1! me te vogel se 0... negative
        if (number <= 1) return 1;
        //hapi reduktues
        return number * factorial(number - 1);
        //10 * 9!
        //9 * 8! ...
        //2 * 1!
        //1==1 return 1
    }


}











