import java.util.Scanner;
public class GamesDamage {


        public static void main(String[] args) {
            /*As a MOBA challenger player, Peter has the bad habit of trashing his PC when he loses a game and rage quits. His gaming setup consists of a headset, mouse, keyboard, and display. You will receive Peter's lost games count.
Every second lost game, Peter trashes his headset.
Every third lost game, Peter trashes his mouse.
When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
Every second time when he trashes his keyboard, he also trashes his display.
You will receive the price of each item in his gaming setup. Calculate his rage expenses for renewing his gaming equipment. */

            Scanner scan = new Scanner(System.in);

            int lostGameCounter = Integer.parseInt(scan.nextLine());
            double headsetPrice = Double.parseDouble(scan.nextLine());
            double mousePrice = Double.parseDouble(scan.nextLine());
            double keyboardPrice = Double.parseDouble(scan.nextLine());
            double displayPrice = Double.parseDouble(scan.nextLine());

            double headset = 0.0;
            double mouse = 0.0;
            double keyboard = 0.0;
            double display = 0.0;

            for (int i = 1; i <= lostGameCounter; i++){

                if(i % 2 == 0){
                    headset ++;
                }
                if(i % 3 == 0){
                    mouse++;
                }
                if(i % 6 == 0){
                    keyboard++;
                }
                if(i % 12 == 0){
                    display++;
                }
            }
            // System.out.println(headset);
            //System.out.println(mouse);
            // System.out.println(keyboard);
            // System.out.println(display);

            double total =(double) (headset*headsetPrice)+(mouse*mousePrice)+(keyboard*keyboardPrice)+(display*displayPrice);
            System.out.printf("Rage expenses: %.2f lv.", total);
        }
    }


