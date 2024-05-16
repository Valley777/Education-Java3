import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = Integer.parseInt(scan.nextLine());
       //You will receive an integer as input from the console.
        // Print the 10 times table for this integer.
        // See the examples below for more information.
        for (int i=1; i<=10; i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
