import java.util.Scanner;
public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //You have a water tank with a capacity of 255 liters.
        //On the next n lines, you will receive liters of water, which you must pour into your tank.
        //If the capacity is not enough, print "Insufficient capacity!" and continue reading the next line.
        // On the last line, print the liters in the tank.
        int n = Integer.parseInt(scan.nextLine());
        int sum=0;
        int capacity =255;
      for(int i=1; i<=n;i++){
          int liters = Integer.parseInt(scan.nextLine());
          sum+=liters;
          if(sum>capacity){
              System.out.println("Insufficient capacity!");
              sum-=liters;
          }
          }
        System.out.println(sum);
      }

    }

