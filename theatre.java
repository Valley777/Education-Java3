import java.util.Scanner;
public class theatre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());

        String price ="";

        switch(day){
            case("Weekday"):
                if(age>=0 && age<=18){
                    price = "12$";
                }else if(age>18 && age<=64){
                    price = "18$";
                }else if(age>64 && age <=122){
                    price = "12$";
                }else{
                    System.out.println("Error!");
                }
                break;
            case("Weekend"):
                if(age>=0 && age<=18){
                    price = "15$";
                }else if(age>18 && age<=64){
                    price = "20$";
                }else if(age>64 && age <=122){
                    price = "15$";
                }else {
                    System.out.println("Error!");
                }
                break;
            case("Holiday"):
                if(age>=0 && age<=18){
                    price = "5$";
                }else if(age>18 && age<=64){
                    price = "12$";
                }else if(age>64 && age <=122){
                    price = "10$";
                }else{
                    System.out.println("Error!");
                }
                break;
            default:
                System.out.println("Error!");
                break;
        }
        System.out.println(price);
    }
}
