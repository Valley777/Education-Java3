import java.util.Scanner;
public class triangleOfNumbersS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i =1; i<=n; i++){
             for (int number =1; number<=i; number++){
                 System.out.print(i+" ");
             }
             System.out.println( );
 }
    }
}
