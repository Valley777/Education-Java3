import java.util.Scanner;
public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Read n numbers and print them in reverse order.
        int n = Integer.parseInt(scan.nextLine());

      int [] numbers = new int [n];   //инициализираме масива

        for (int position = 0; position <= numbers.length -1; position++){  //прочитаме и попълваме елементите за всяка една от позициите
            numbers[position] = Integer.parseInt(scan.nextLine());
        }

        for (int i =numbers.length -1; i>=0; i--){     //принтираме елементите като започваме от елемента на последна позиция
            System.out.print(numbers[i]+ " ");
        }
    }
}
