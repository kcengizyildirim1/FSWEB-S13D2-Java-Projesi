import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(7070));


        System.out.println("------------------------------");

        System.out.println(isPerfectNumber(6));

        System.out.println("------------------------------");

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));



    }
    public static boolean isPalindrome(int number) {

        number = Math.abs(number);
        String num = Integer.toString(number);
        String reversed = new StringBuilder(num).reverse().toString();
        return num.equals(reversed);
    }




    public static boolean isPerfectNumber (int num) {
        if (num <= 0) {
            return false;
        }

        int total = 0;
        for(int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        return total == num;
    }

    public static String numberToWords (int num) {
        if(num < 0) {
            return "Invalid value";
        }
        char[] digits = Integer.toString(num).toCharArray();



        String number = "";
        for (char digit: digits){
            switch (digit) {
                case '0':
                    number += "Zero ";
                    break;
                case '1':
                    number +=("One ");
                    break;
                case '2':
                    number +=("Two ");
                    break;
                case '3':
                    number +=("Three ");
                    break;
                case '4':
                    number +=("Four ");
                    break;
                case '5':
                    number +=("Five ");
                    break;
                case '6':
                    number +=("Six ");
                    break;
                case '7':
                    number +=("Seven ");
                    break;
                case '8':
                    number +=("Eight ");
                    break;
                case '9':
                    number +=("Nine ");
                    break;
            }
        }

        return number.trim();
    }
}