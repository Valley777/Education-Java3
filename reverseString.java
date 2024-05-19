import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Write a program that reverses a string and prints it on the console.
        String word = scan.nextLine(); //  input

        String str= word;
        String newWord="";
        char ch;
        for (int i=0; i<word.length(); i++)
        {
            ch= word.charAt(i);                          //extracts each character
            newWord = ch+newWord; //adds each character in front of the existing string
        }
       //System.out.println("reversed word is: "+  newWord); //checks
        System.out.println(newWord);
    }
}
