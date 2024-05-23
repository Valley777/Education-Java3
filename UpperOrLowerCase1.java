import java.util.Scanner;
public class UpperOrLowerCase1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char symbol = scan.nextLine().charAt(0);
        //проверка дали буквата е главна или малка
        /*// начин 1
        if(Character.isUpperCase(symbol)){
            //главна буква
            System.out.println("upper-case");
        }else{
            //малка буква
            System.out.println("lower-case");
        }
        */
         //начин 2
        //малка буква  - код 97; 122
        int code = (int )symbol; //ascii code на въведеният символ
        if (code >=97 && code <=122){
            System.out.println("lower-case");
        }else if(code >=65 && code <=90) {
            System.out.println("upper-case");
        }
    }
}
