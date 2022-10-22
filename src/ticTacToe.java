import java.util.Scanner;

public class ticTacToe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lets play Tic Tac Toe\n");
        char[][] board ={
                {'_','_','_'},
                {'_','_','_'},
                {'_','_','_'}
        };

        //print the array
        printBoard(board);

        // taking turns
        for(int i=0; i<9;i++){
            if(i%2==0){
                System.out.println("Turn X: ");
                int[] spot=askUser(board);
                board[spot[0]][spot[1]] = 'X';
            }else{
                System.out.println("Turn 0: ");
                int[] spot=askUser(board);
                board[spot[0]][spot[1]] = 'O';
            }
            printBoard(board);
            int count = checkWin(board);

            if(count==3){
                System.out.println("X wins!");
                break;
            }else if(count==-3){
                System.out.println("O wins!");
                break;
            }else if(i==8){
                System.out.println("Its a tie!");
            }
        }

        scan.close();


    }

    public static void printBoard(char[][] board){
        System.out.print("\n");
        for(int i=0; i<board.length; i++){
            System.out.print("\t");
            for(int j=0; j<board.length;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.print("\n\n");
        }
    }

    public static int[] askUser(char[][]board){
        Scanner scan = new Scanner(System.in);
        System.out.print(" * Pick a row and column number * :");
        int row = scan.nextInt();
        int element = scan.nextInt();

        while(board[row][element]=='X' || board[row][element]=='O'){
            System.out.print(" * Spot already taken - Pick a row and column number * :");
             row = scan.nextInt();
             element = scan.nextInt();
        }
        return new int[] {row,element};
    }

    public static int checkWin(char[][] board){

        int count=0;
        //checking the rows
        for(int i=0; i<board.length;i++){
            for(int j=0; j<board[i].length;j++){
                if(board[i][j]=='X'){
                    count++;
                } else if (board[i][j]=='O') {
                    count--;
                }
            }
            if(count==3||count==-3){
                return count;
            }else{
                count =0;
            }
        }
        //checking the columns
        for(int i=0; i<3; i++){
            for(int j=3; j<board.length;j++){
                if(board[j][i]=='X'){
                    count ++;
                } else if (board[j][i]=='O') {
                    count--;
                }
            }

            if(count==3||count==-3){
                return count;
            }else{
                count=0;
            }
        }

        // checking left diagonals
        for(int i=0; i<3;i++){
            if(board[i][i]=='X'){
                count++;
            } else if (board[i][i]=='O') {
                count--;
            }
        }

        if(count==3||count==-3){
            return count;
        }else{
            count=0;
        }

        // checking left diagonals
        for(int i=0; i<3;i++){
            int rowIndex=2 - i;
            if(board[rowIndex][i]=='X'){
                count++;
            }else if(board[rowIndex][i]=='O'){
                count--;
            }
        }

        return count;

    }

}
