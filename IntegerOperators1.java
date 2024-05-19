import java.util.Scanner;
public class IntegerOperators1 {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                double a1 = Double.parseDouble(scan.nextLine());
                double a2 = Double.parseDouble(scan.nextLine());
                double a3 = Double.parseDouble(scan.nextLine());
                double a4 = Double.parseDouble(scan.nextLine());

                a1 = a1+a2;
                a1 = a1/a3;
                a1 = a1*a4;
                System.out.printf("%.0f",a1);
                }
            }


