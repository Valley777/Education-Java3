import java.util.Scanner;
public class ordersCapsulesCoffee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
  //We are placing N orders at a time. You need to calculate the price on the following formula:
 //((daysInMonth * capsulesCount) * pricePerCapsule)
/*
     • On the first line, you will receive integer N – the count of orders the shop will receive.
    • For each order, you will receive the following information:
        ◦ Price per capsule - floating-point number in the range [0.00…5000.00].
        ◦ Days – integer in the range [1…31].
        ◦ Capsules count - integer in the range [0…7000000].
 */
       int numOrders = Integer.parseInt(scan.nextLine());
       double money=0.0;
       for (int i =1; i<=numOrders; i++){
           double priceCapsule = Double.parseDouble(scan.nextLine());
           int daysMonth = Integer.parseInt(scan.nextLine());
           int capsulesCount = Integer.parseInt(scan.nextLine());

           double orderPrice =(double) daysMonth*capsulesCount*priceCapsule;
           money +=orderPrice;
           System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
       }
System.out.printf("Total: $%.2f", money);
    }
}
