import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //You will be given a single integer. Your task is to find the sum of its digits.
        String n = scan.nextLine();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '1') {
                sum += 1;
            } else if (n.charAt(i) == '2') {
                sum += 2;
            } else if (n.charAt(i) == '3') {
                sum += 3;
            } else if (n.charAt(i) == '4') {
                sum += 4;
            } else if (n.charAt(i) == '5') {
                sum += 5;
            } else if (n.charAt(i) == '6') {
                sum += 6;
            } else if (n.charAt(i) == '7') {
                sum += 7;
            } else if (n.charAt(i) == '8') {
                sum += 8;
            } else if (n.charAt(i) == '9') {
                sum += 9;
            }
        }
        String str1 = Integer.toString(sum);
        System.out.println(str1);
    }
}
