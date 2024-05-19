import java.util.Scanner;
public class convertMeterToKm {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int  meters = Integer.parseInt(scan.nextLine());
            double km =(double) meters*0.001;
            System.out.printf("%.2f",km);
        }
    }

