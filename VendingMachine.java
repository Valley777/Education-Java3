import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double sumCoins = 0.0;
       // Your task is to calculate the total purchase price from a vending machine. Until you receive "Start" you will be given different coins that are being inserted into the machine.
      //Until you receive "Start" you will be given different coins that are being inserted into the machine.
        // You have to sum them to have the total money inserted.
       // our vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins.
        // If someone tries to insert some other coins, you have to display "Cannot accept {money}", where the value is formatted to the second digit after the decimal point and not add it to the total money. O
        String input = scan.nextLine();
        while (!input.equals("Start")) {

            double coin = Double.parseDouble(input);

            //1. Проверим дали монетата е валидна
            //0.1, 0.2, 0.5, 1, and 2
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                //2. Сумираме монетите
                sumCoins += coin;
            } else {
                System.out.printf("Cannot accept %.2f\n", coin);
            }

            input = scan.nextLine();
        }

        String product = scan.nextLine();
        while (!product.equals("End")) {

            switch (product) {
                case "Nuts":
                    if (sumCoins >= 2.00) {
                        System.out.println("Purchased " + product);
                        sumCoins -= 2.00;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sumCoins >= 0.70) {
                        System.out.println("Purchased " + product);
                        sumCoins -= 0.70;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sumCoins >= 1.50) {
                        System.out.println("Purchased " + product);
                        sumCoins -= 1.50;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sumCoins >= 0.80) {
                        System.out.println("Purchased " + product);
                        sumCoins -= 0.80;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sumCoins >= 1.00) {
                        System.out.println("Purchased " + product);
                        sumCoins -= 1.00;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scan.nextLine();
        }

        System.out.printf("Change: %.2f", sumCoins);
    }
}


