import java.util.Scanner;
public class TriangleOfNumbers {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     //Write a program that receives a number – n and prints a triangle from 1 to n as in the examples.
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i<=n;i++){
            for (int j =1; j<=i;j++){
                System.out.print (i+" ");
            }
            System.out.println("");
        }
    }
}
