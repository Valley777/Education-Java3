import java.util.Scanner;
public class LowerOrUpperCase {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
 //Write a program that prints whether a given character is upper-case or lower-case.
            String word = sc.next();
            boolean containsUpper = false;
            boolean containsLower = false;
            char ch;

            for (int i = 0; i < word.length(); i++) {
                ch = word.charAt(i);

                if (Character.isUpperCase(ch)) {
                    containsUpper = true;
                } else if (Character.isLowerCase(ch)) {
                    containsLower = true;
                }
            }

             if(containsUpper){ // if    upperCase is true
                System.out.println("upper-case");
            }
            else{ // if lowerCase is true.
                System.out.println("lower-case");
            }
        }
    }

