import java.util.Scanner;
public class elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Calculate how many courses will be needed to elevate n persons by using an elevator with a capacity of p persons.
        //The input holds two lines: the number of people n and the capacity p of the elevator.
        int persons = Integer.parseInt(scan.nextLine());
        int capacityPersons= Integer.parseInt(scan.nextLine());

        int course = persons/capacityPersons;

        if(persons%capacityPersons != 0){
            System.out.println(course+1);
        }else{
            System.out.println(course);
        }

    }
}
