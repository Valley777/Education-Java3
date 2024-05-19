import java.util.Scanner;
public class Elevatr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // Calculate how many courses will be needed to elevate n persons by using an elevator with a capacity of p persons.
               // The input holds two lines: the number of people n and the capacity p of the elevator.
        int numOfPeople = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());
        int courses = numOfPeople/capacity;
        int coursesPlus = numOfPeople%capacity;
        if(coursesPlus!=0){
            System.out.println(courses+1);
        }else{
            System.out.println(courses);
        }
    }
}
