import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char symbol = 'd';
        System.out.println((int)symbol);
        int number1 = 97;
        System.out.println((char)number1);
       char letter1 ='A';
       char letter2 ='B';
        //'AB ' > means that the values will be calculated, i.e. value of A and the value of B
        System.out.println(letter1+letter2);
    }
}
