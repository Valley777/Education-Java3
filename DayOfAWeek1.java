import java.util.Scanner;
import java.util.Arrays;

public class DayOfAWeek1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] weekDays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(int i=1; i<=7 ;i++){        //weekDays.length-1
            if(i==n){
                System.out.println(weekDays[i-1]);
            }
        }
        if(n>=8){
            System.out.println("Invalid day!" );
        }else if(n<=0){
            System.out.println("Invalid day!" );
        }
    }
    }

