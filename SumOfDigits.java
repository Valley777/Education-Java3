import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       //You will be given a single integer. Your task is to find the sum of its digits.
        //i.e. 245678 > 32

       String numbers = scan.nextLine(); //read num as String
       int sum=0;                        //sumator
       for (int i=0; i<numbers.length();i++){
           char a = numbers.charAt(i); //convert each number to char
           //System.out.println(a);    //check
           int b = Integer.parseInt(String.valueOf(a)); //convert each char to int
        //  System.out.println(b);     //check
           sum+=b;                   //sum it
       }

       System.out.println(sum);    //print

    }
}
