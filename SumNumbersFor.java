import java.math.BigDecimal;
import java.util.Scanner;
public class SumNumbersFor {
    public static void main(String[] args) {
        //Write a program to enter n numbers and calculate and print their exact sum (without rounding).
        //condition: use BigDecimal
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        BigDecimal sum = new BigDecimal("0");
        for (int i=1; i<=n; i++){
            BigDecimal num = new BigDecimal(scan.nextLine());
            sum = sum.add(num);


        }
        System.out.println (sum);
    }
}
