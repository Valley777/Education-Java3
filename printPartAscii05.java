import java.util.Scanner;
public class printPartAscii05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Write a program that sums the ASCII codes of n characters. Print the sum on the console.
Input
    • On the first line, you will receive n – the number of lines that follow.
    • On the next n lines – you will receive letters from the Latin alphabet.

         */
        int startCode = Integer.parseInt(scan.nextLine());
        int endCode = Integer.parseInt(scan.nextLine());
        for (int code = startCode; code <=endCode; code++) {
            System.out.print((char)code+" ");

        }
    }
}
