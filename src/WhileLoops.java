import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int diceUser=1;
        int dicePC=0;

        while(diceUser != dicePC){
            System.out.println("Write your dice number: ");
            diceUser = scan.nextInt();
            dicePC = (int)(Math.random() * 10);
            System.out.println("Your dice: " + diceUser);
            System.out.println("Dice PC: " + dicePC);
            }
        System.out.println("End of the Game");

        }

    }



