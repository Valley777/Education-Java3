import java.util.Scanner;
public class Ages {
    public static void main(String[] args) {
        //Write a program that determines whether a person is based on the given age:
        // baby, child, teenager, adult, or elder. The bounders are:
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
         if(n>=0 && n<=2){
            System.out.println("baby");
         }
         if(n>=3 && n<=13){
            System.out.println("child");
         }
         if(n>=14 && n<=19){
            System.out.println("teenager");
         }
         if(n >=20 && n<=65){
            System.out.println("adult");
        }
         if(n>=66){
            System.out.println("elder");
        }else if(n<0){
            System.out.println("Error");
        }
    }
}
