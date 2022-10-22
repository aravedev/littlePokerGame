import java.util.Arrays;
import java.util.Scanner;

public class UpdatingArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] menu = {"espresso", "iced coffee", "macchiato"};
        menu[2]="latte";

        // Convert an array to string
        System.out.println(Arrays.toString(menu));

        // Creating an array that holds 5 values
        String [] newMenu= new String[5];
        String newDrink;
        int i=0;
        while(i<5){
            System.out.println("Add a new drink: ");
            newDrink = scan.nextLine();
            newMenu[i]= newDrink;
            i++;
        }

        for(int j=0; j<newMenu.length; j++){
            System.out.println(newMenu[j]);
        }
    }
}
