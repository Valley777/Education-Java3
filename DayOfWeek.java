import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
       //Enter a day number and print the day name (in English) or "Invalid day!". Use an array of strings.
       Scanner scan = new Scanner(System.in);
       //Print the element at index (day-1) when it is in the range [1…7] or "Invalid Day!" otherwise.
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; //инициираме стринг с елементи
        int currentDay = Integer.parseInt(scan.nextLine()); //от конзолата се чете номер на елемент от масива
        if(currentDay >=1 && currentDay <= 7){  //валидация на входящият номер
            System.out.println(days[currentDay-1]);
        }else{
            System.out.println("Invalid day!");
        }
    }
}