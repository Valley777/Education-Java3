import java.util.Scanner;
import java.util.*;
public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
 //Write a method that returns the English name of the last digit of a given number.
 // Write a program that reads an integer and prints the returned value from this method.

        Scanner scan = new Scanner(System.in);
        String sequence = scan.nextLine(); //reading string of numbers
        String str = sequence;            //reading the last Char fomr the string
       // System.out.println("last char = " + str.charAt(str.length() - 1)); //checks
        String s = ""+(str.charAt(str.length() - 1)); //converting the char to String
       // System.out.println(s);  //checks
        switch(s){
            case("1"):
                System.out.println("one");
                break;
            case("2"):
                System.out.println("two");
                break;
            case("3"):
                System.out.println("three");
                break;
            case("4"):
                System.out.println("four");
                break;
            case("5"):
                System.out.println("five");
                break;
            case("6"):
                System.out.println("six");
                break;
            case("7"):
                System.out.println("seven");
                break;
            case("8"):
                System.out.println("eight");
                break;
            case("9"):
                System.out.println("nine");
                break;
            case("0"):
                System.out.println("zero");
                break;
        }
    }
            }



