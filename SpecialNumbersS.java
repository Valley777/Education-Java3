import java.util.Scanner;
public class SpecialNumbersS {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //A number is special when its sum of digits is 5, 7, or 11.
            //Write a program to read an integer n and for all numbers in the range 1…n to print the number and if it is special or not (True / False).

            int number = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= number ; i++) {
                int sumOfDigits = 0;
                int digit = i;
                while (digit > 0){
                    sumOfDigits += digit % 10;
                    digit = digit / 10;
                }

                if(sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11){
                    System.out.printf("%d -> True%n", i);
                }else {
                    System.out.printf("%d -> False%n", i);
                }

            }
        }
    }

