import java.util.Scanner;
import java.util.Arrays;
public class EqualArrays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] val = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] gubi = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;
        boolean o = false;
        for (int i = 0; i <= val.length - 1 && i <= gubi.length - 1; i++) {
            //try to run both arrays simultaneously - OK
            // System.out.println(firstArray[i]+" firstA %n");
            // System.out.println(secondArray[i]+ "secondA %n");
            sum += val[i];
            if (val[i] != gubi[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                o=false;
                break;
            }else{
                o=true;
            }
            }
           if(o){System.out.printf("Arrays are identical. Sum: %d", sum);}
        }}

