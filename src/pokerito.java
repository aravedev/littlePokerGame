import java.util.Scanner;

public class pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        //System.out.println(randomCard());

        // Rules
        System.out.println("Lets play, type when you are ready");
        scan.nextLine();
        System.out.println("Its like poker, but a lot simpler\n");
        System.out.println("You play against the PC");
        System.out.println("Each player receives one card");
        System.out.println("Then the dealer will draw 5 cards (the river)");
        System.out.println("Then player with most river matches win");
        System.out.println("If the matches are equal, everybody wins\n");
        System.out.println("Lets go!");
        scan.nextLine();

        String yourCard = randomCard();
        String computerCard =randomCard();

        System.out.println("Here is your card");
        System.out.println(yourCard);
        System.out.println("\nHere is the computer card:");
        System.out.println(computerCard);

        int yourMatches=0;
        int computerMatches=0;

        System.out.println("Now, the dealer will draw 5 cards. Press enter to continue");
        for(int i=1; i<=5;i++){
            scan.nextLine();
            String draw = randomCard();
            System.out.println("Card " + i);
            System.out.println(draw);

            if(yourCard.equals(draw)){
                yourMatches++;
            }
            if(computerCard.equals(draw)){
                computerMatches++;
            }
        }

        System.out.println("Your matches " + yourMatches);
        System.out.println("Computer matches " + computerMatches);

        if(yourMatches>computerMatches){
            System.out.println("You win");
        }else if(yourMatches<computerMatches){
            System.out.println("PC wins");

        }else{
            System.out.println("Its a tide");
        }
        scan.close();
    }

    public static String randomCard(){
        int randomNumber = (int)((Math.random()*13)+1);

        switch (randomNumber){
            case 1: return "Card A";
            case 2: return "Card 2";
            case 3: return "Card 3";
            case 4: return "Card 4";
            case 5: return "Card 5";
            case 6: return "Card 6";
            case 7: return "Card 7";
            case 8: return "Card 8";
            case 9: return "Card 9";
            case 10: return "Card 10";
            case 11: return "Card J";
            case 12: return "Card Q";
            case 13: return "Card K";
            default: return "Bro...";
        }
    }
}
