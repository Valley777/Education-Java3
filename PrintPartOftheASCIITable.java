import java.util.Scanner;
public class PrintPartOftheASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //write a program that prints part of the ASCII table of characters at the console.
        //i.e. 60 65  >   < = > ? @ A
        int firstNum = Integer.parseInt(scan.nextLine());
        int lastNum = Integer.parseInt(scan.nextLine());
        for(int i = firstNum; i<=lastNum;i++){
            System.out.print((char)i+" ");
        }

    }
}
