import java.util.Scanner;
import java.util.Arrays;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] array7 = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();

        int []array8 = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();

        int sumArray7 =0;
        int sumArray8 =0;
        for(int number: array7){   //Iterate through all elements in the array7.
           sumArray7 += number;
        }
        for(int number1: array8){   //Iterate through all elements in the array8.
            sumArray8 += number1;
        }


      if(sumArray7==sumArray8){
          System.out.printf("Arrays are identical. Sum: %d",sumArray8);
      }else{
          System.out.println("Arrays are not identical. Found difference at 0 index");
      }

    }
}
